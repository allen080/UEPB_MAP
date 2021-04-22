public class Main {
	public static void main(String args[]){
		Curso jogosDigitais = new Curso("Jogos Digitais",
		"Motores de Jogos",
		"Logica de programacao",
		"Programacao Estruturada",
		"Programacao Orientada a Objetos",
		400); // cria um curso
		
		// faz uma copia do curso anterior, armazenando os mesmos dados porém com os endereços de memoria diferentes
		Curso web = jogosDigitais.clonar(); 
		// muda os valores do novo curso
		web.setNome("Web");
		web.setDisciplinaEsp("Desenvolvimento Web");
		// exibe as informações de cada curso
		System.out.println(jogosDigitais);
		System.out.println(web);
	}
}