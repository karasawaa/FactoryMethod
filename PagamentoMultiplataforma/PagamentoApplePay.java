public class PagamentoApplePay implements Pagamento {
    private String idApplePay;

    public PagamentoApplePay(String idApplePay) {
        this.idApplePay = idApplePay;
    }

    private boolean validarApplePay() {
        // Simulação: ID não pode ser vazio
        return idApplePay != null && !idApplePay.isEmpty();
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarApplePay()) {
            return "Erro: ID Apple Pay inválido.";
        }
        return "Pagamento de R$" + valor + " realizado via Apple Pay.";
    }
}