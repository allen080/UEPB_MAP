import java.util.Map;
import java.util.HashMap;

public class Hamburgueria {
	private String hamburguer,bebida,fritas,sobremesa;
	private Map<String,String[]> menu; // menu auxiliar que verificará os pedidos passados

	// Construtores
	public Hamburgueria(){
		this.menu = new HashMap<String,String[]>();
		menu.put("hamburguers",new String[]{"vegetariano","gringo","animal","tradicional"});
		menu.put("bebidas",new String[]{"coca cola","guarana","suco de limao","suco de laranja"});
		menu.put("fritas",new String[]{"batata com bacon","batata com cheddar","batata fitness","batata animal"});
		menu.put("sobremesas",new String[]{"milkshake","mouse de limao","sorvete de chocolate","acai"});
	}
	public Hamburgueria(String hamburguer,String bebida,String fritas,String sobremesa){
		this();
		setHamburguer(hamburguer);
		setBebida(bebida);
		setFritas(fritas);
		setSobremesa(sobremesa);
	}

	// exibe o cardapio completo para o usuario
	public void verMenu(){
		String opcoes[] = {"Hamburguers","Bebidas","Fritas","Sobremesas"};
		
		for(String op: opcoes){
			System.out.printf("\n%s:\n",op);
			for(String op_tipos: this.menu.get(op.toLowerCase())){ // percorre todas opções do menu
				System.out.printf("\t- %s\n",op_tipos);
			}
			System.out.println("\n_________________________________\n");
		}	
	}

	// verifica se um pedido esta no menu
	private boolean pedidoValido(String pedidoTipo,String pedidoOpcao){
		for(String opcoes: menu.get(pedidoTipo)){ // percorre os vetores das opcoes do cardapio (hamburguers, sobremesas, etc)
			if(opcoes.equals(pedidoOpcao.toLowerCase())) // verifica se o pedido do usuario esta na lista de opções fornecidas pela hamburgueria
				return true;
		}
		System.err.printf("[!] \"%s\" nao consta no cardapio. Veja cardapio com Hamburgueria().verMenu()\n",pedidoOpcao);
		return false;
	}

	//setters:
	public void setHamburguer(String hamburguer){
		if(pedidoValido("hamburguers",hamburguer))
			this.hamburguer = hamburguer;
	}
	public void setBebida(String bebida){
		if(pedidoValido("bebidas",bebida))
			this.bebida = bebida;
	}
	public void setFritas(String fritas){
		if(pedidoValido("fritas",fritas))
			this.fritas = fritas;
	}
	public void setSobremesa(String sobremesa){
		if(pedidoValido("sobremesas",sobremesa))
			this.sobremesa = sobremesa;
	}

	//getters:
	public String getHamburguer(){
		return this.hamburguer;
	}
	public String getBebida(){
		return this.bebida;
	}
	public String getFritas(){
		return this.fritas;
	}
	public String getSobremesa(){
		return this.sobremesa;
	}

	// toString:
	public String toString(){
		String all[] = {hamburguer,bebida,fritas,sobremesa};
		String pedido = "";
		boolean first = true;

		for(String opcoes: all){ // percorre todos os itens do pedido do cliente
			if(first && opcoes!=null){ // verifica se esta no primeiro valor do array
				first = false;
				pedido += opcoes;
			} else if(opcoes!=null){
				pedido += " + "+opcoes;
			}
		}
		return pedido;
	}

}