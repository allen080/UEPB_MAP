public class Audio {
    private int frequencia,volume;
    private double canal;

	public Audio(){
        // frequencia, volumes e canal nao setados
        this.frequencia = 0;
        this.volume = 0;
        this.canal = 0.0;
    }
    
    public boolean configurarFrequência(int novafreq){
        if(novafreq < 0 || novafreq > 100)
            return false;
        
        this.frequencia = novafreq; // modifica a frequencia de audio
        return true;
    }

    public boolean configurarVolume(int novoVol){
        if(novoVol < 0 || novoVol > 100)
            return false;
        
        this.volume = novoVol; // seta o volume
        return true;
    }
    
    public boolean configurarCanais(double novoCanal){
        if(novoCanal < 0)
            return false;
        
        this.canal = novoCanal; // configura o canal de audio
        return true;
    }
    
    public boolean reproduzirAudio(String fileaudio){
        String formatos[] = {".mp3",".wav",".ogg"};
        boolean suportado = false;

        for(String formato: formatos){
            if(fileaudio.endsWith(formato))
                suportado = true;
        }

        if(suportado)
            System.out.println("[*] tocando "+fileaudio);
        
        return suportado;
    }
}