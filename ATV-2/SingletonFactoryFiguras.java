public class SingletonFactoryFiguras {
	private static int quantCirc,quantQuad,quantTriRet,quantTriIsos,quantTriEqui;
	private static final int MAX_QUAD = 5;
	private static final int MAX_CIRC = 1;
	private static final int MAX_TRI_RET = 1;
	private static final int MAX_TRI_ISOS = 1;
	private static final int MAX_TRI_EQUI = 1;

	private SingletonFactoryFiguras(){}

	// metodos de criação de cada figura
	private static Circulos criarCirculo(){
		quantCirc++;
		return new Circulos();
	}
	private static Quadrados criarQuadrado(){
		quantQuad++;
		return new Quadrados();
	}
	private static TrianguloRetangulo criarTriRet(){
		quantTriRet++;
		return new TrianguloRetangulo();
	}
	private static TrianguloIsosceles criarTriIsos(){
		quantTriIsos++;
		return new TrianguloIsosceles();
	}
	private static TrianguloEquilatero criarTriEqui(){
		quantTriEqui++;
		return new TrianguloEquilatero();
	}

	private static void errorMsg(String tipo){ // erro ao criar uma determinada figura
		System.err.printf("[!] Nao foi possivel criar outro %s\n\n",tipo);
	}

	// metodo geral de criação para todas figuras que o cliente utilizará
	public static Figuras createFigura(String tipo){
		tipo = tipo.toLowerCase();

		if(tipo.equals("circulo") && quantCirc<MAX_CIRC)
			return criarCirculo();
		else if(tipo.equals("quadrado") && quantQuad<MAX_QUAD)
			return criarQuadrado();
		else if(tipo.equals("triangulo retangulo") && quantTriRet<MAX_TRI_RET)
			return criarTriRet();
		else if(tipo.equals("triangulo equilatero") && quantTriEqui<MAX_TRI_EQUI)
			return criarTriEqui();
		else if(tipo.equals("triangulo isosceles") && quantTriIsos<MAX_TRI_ISOS)
			return criarTriIsos();

		errorMsg(tipo);
		return null;
	}
}
