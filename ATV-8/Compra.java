public class Compra {
    private String nomeDaLoja;
    private double valorTotal;
	private int idNotaFiscal;
    private final int MAX_idNotaFiscal,MIN_idNotaFiscal;

    public Compra(String nomeDaLoja){
        this.MAX_idNotaFiscal = 1000000; // id maximo permitido pela nota fiscal da loja
        this.MIN_idNotaFiscal = 100000; // id minimo permitido pela nota fiscal da loja

        this.nomeDaLoja = nomeDaLoja;
        this.valorTotal = 0;
        this.idNotaFiscal = this.gerarNotaFiscal();
    }

    // seta o valor da compra
    public void setValor(double valor){
        this.valorTotal = valor;
    }

    // exibe informacoes da compra do produto e de sua nota fiscal
    public String getInfoNota(){
        return String.format("Valor total da Compra: R$%.2f\nNota Fiscal: %d",valorTotal,idNotaFiscal);
    }

    // gera o id da nota fiscal (entre o valor minimo e maximo permitido pelo sistema)
    private int gerarNotaFiscal(){
        return (int)(Math.random() * (MAX_idNotaFiscal-MIN_idNotaFiscal) + MIN_idNotaFiscal);
    }
}