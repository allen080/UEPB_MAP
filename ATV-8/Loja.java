public class Loja {
	private String nomeDaLoja;

    public Loja(String nomeDaLoja){
        this.nomeDaLoja = nomeDaLoja;
    }

    public void executarCompra(double valor,PagamentoCommand formaDePagamento){
        Compra compraEfetuada = new Compra(this.nomeDaLoja); // faz a compra do produto
        
        compraEfetuada.setValor(valor);
        System.out.printf("\n[*] Obrigado por comprar na %s!\n",this.nomeDaLoja);
        
        formaDePagamento.processarCompra(compraEfetuada);
    }
}