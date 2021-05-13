public class Video {
    private String resolucao,coresImagem[];

    public Video(){
        this.resolucao = "0x0";
        this.coresImagem = null;
    }

	public void configurarResolucao(String novaResolucao){
        this.resolucao = novaResolucao;
    }

    public void configurarCores(String[] coresImagem){
        this.coresImagem = coresImagem;
    }

    public boolean renderizarImagem(String fileimage){
        String formatos[] = {".png",".jpg",".jpeg",".bmp"};
        boolean suportado = false;

        for(String formato: formatos){
            if(fileimage.endsWith(formato))
                suportado = true;
        }

        if(suportado)
            System.out.println("[*] renderizando "+fileimage);
        
        return suportado;
    }
}