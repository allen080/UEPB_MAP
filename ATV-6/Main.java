public class Main {
	public static void main(String args[]){
		FacadeSistemasJogos sistemaConfig = new FacadeSistemasJogos();
		
		sistemaConfig.gerenciarVideo("imagem.png","800x500");
		sistemaConfig.gerenciarAudio("audio.mp3",5.1,60,40);
		sistemaConfig.gerenciarInputs("Razer Lycosa ABNT_2","DualShock PS3 1.7v");
	}
}