public class Main {
	public static void main(String args[]){
		// vetor de hamburguerias que conterá os 3 pedidos
		Hamburgueria irmaoFirmino[] = new Hamburgueria[3];

		// faz os pedidos dos lanches
		irmaoFirmino[0] = new HamburgueriaBuilder("Vegetariano")
			.beber("Suco de Laranja")
			.acompanhamento("Batata Fitness")
			.finalizar_Pedido();

		irmaoFirmino[1] = new HamburgueriaBuilder("Animal")
			.beber("Coca cola")
			.acompanhamento("Batata animal")
			.sobremesa("Milkshake")
			.finalizar_Pedido();

		irmaoFirmino[2] = new HamburgueriaBuilder("Tradicional")
			.beber("Suco de limao")
			.sobremesa("Acai")
			.finalizar_Pedido();

		for(int i=0;i<3;i++){ // exibe as informacoes dos 3 pedidos
			System.out.printf("Pedido %d: %s\n",i+1,irmaoFirmino[i]);
		}
	}
}