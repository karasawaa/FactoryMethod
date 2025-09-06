public class FactoryApplePay extends PagamentoFactory {
    private String idApplePay;

    public FactoryApplePay(String idApplePay) {
        this.idApplePay = idApplePay;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoApplePay(idApplePay);
    }
}