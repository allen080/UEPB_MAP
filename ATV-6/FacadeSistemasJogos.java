public class FacadeSistemasJogos {
    private Audio audio;
    private Video video;
    private Input input;

    public FacadeSistemasJogos(){
        this.audio = new Audio();
        this.video = new Video();
        this.input = new Input();
    }

    public Audio getAudio(){
        return this.audio;
    }
    public Input getInput(){
        return this.input;
    }
    public Video getVideo(){
        return this.video;
    }

    public void gerenciarAudio(String fileaudio,double canal,int volume,int frequencia){
        if(!audio.configurarCanais(canal))
            System.err.println("[!] erro na configuracao do canal");
        else if(!audio.configurarFrequência(frequencia))
            System.err.println("[!] erro na configuracao da frequencia");
        else if(!audio.configurarVolume(volume))
            System.err.println("[!] erro na configuracao do volume");
        else if(!audio.reproduzirAudio(fileaudio))
            System.err.println("[!] erro na reproducao do audio");
    }

    public void gerenciarInputs(String teclado,String joystick){        
        if(input.lerInput(teclado,joystick)){
            System.out.println("[*] input");
        } else {
            System.err.println("[!] erro na configuracao dos Inputs");
        }
    }

    public void gerenciarVideo(String fileimage,String resolucao){
        String cores[] = {"RED","GREEN","BLUE"};

        video.configurarCores(cores);
        video.configurarResolucao(resolucao);
        
        if(!video.renderizarImagem(fileimage)){
            System.err.printf("[!] erro ao renderizar a imagem \"%s\": formato nao suportado\n",fileimage);
        }
    }
}