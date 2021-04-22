public class HamburgueriaBuilder {
	private final String hamburguer;
	private String bebida,fritas,sobremesa;
	private Hamburgueria pedido;

	public HamburgueriaBuilder(String hamburguer){
		this.hamburguer = hamburguer;
		pedido = new Hamburgueria();
		pedido.setHamburguer(this.hamburguer); // seta o item obrigatorio
	}

	// setters não obrigatorios
	public HamburgueriaBuilder beber(String bebida){ // seta a bebida
		this.bebida = bebida;
		pedido.setBebida(this.bebida);
		return this;
	}

	public HamburgueriaBuilder acompanhamento(String fritas){ // seta o acompanhamento
		this.fritas = fritas;
		pedido.setFritas(this.fritas);
		return this;
	}
	public HamburgueriaBuilder sobremesa(String sobremesa){
		this.sobremesa = sobremesa;
		pedido.setSobremesa(this.sobremesa);
		return this;
	}

	public Hamburgueria finalizar_Pedido(){ // finaliza o pedido e retorna o objeto da Hamburgueria para o cliente
		return this.pedido;
	}
}