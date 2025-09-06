public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        // Simular pagamento por cartão de crédito
        service.processarPagamento(new FactoryCartaoCredito("1234567890123456"), 150.00);

        // Simular pagamento por PayPal
        service.processarPagamento(new FactoryPayPal("usuario@paypal.com"), 75.00);

        // Simular pagamento por Criptomoeda
        service.processarPagamento(new FactoryCriptomoeda(500.00), 300.00);

        // Simular pagamento por Apple Pay
        service.processarPagamento(new FactoryApplePay("id_apple_pay"), 100.00);
    }
}