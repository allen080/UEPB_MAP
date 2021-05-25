import java.util.HashMap;

public class Cliente {
	public static HashMap<String,PagamentoCommand> processarPagamento(){
		HashMap<String,PagamentoCommand> pagamentos = new HashMap<>();
		
		pagamentos.put("boleto",new PagamentoBoleto());
		pagamentos.put("credito",new PagamentoCartaoCredito());
		pagamentos.put("debito",new PagamentoCartaoDebito());

		return pagamentos;
	}

	public static void main(String args[]){
		Loja magalu = new Loja("Magazine Luiza");
		HashMap<String,PagamentoCommand> formasPagamento = processarPagamento();

		magalu.executarCompra(50,formasPagamento.get("boleto"));
		magalu.executarCompra(150,formasPagamento.get("debito"));
		magalu.executarCompra(300,formasPagamento.get("credito"));
	}
}