public class PagamentoBoleto implements PagamentoCommand {
    @Override
    public void processarCompra(Compra compra){
        System.out.println(compra.getInfoNota());
        System.out.println("[*] Pagamento feito no Boleto!");
    }
}