public class Main {
	public static void main(String args[]){
		// cria um circulo com a fabrica singleton de figuras
		Figuras circulo = SingletonFactoryFiguras.createFigura("circulo");
		// exibe as informacoes do circulo
		circulo.getFigura();
		// tentar criar outro circulo
		circulo = SingletonFactoryFiguras.createFigura("circulo");

		// tenta criar 6 quadrados, para provar que se tentar criar mais do que cinco, vai da erro
		for(int i=0;i<6;i++){ 
			Figuras quad = SingletonFactoryFiguras.createFigura("quadrado");
			if(quad!=null) quad.getFigura(); // exibe as informacoes do quadrado, se foi criado
		}
	}
}