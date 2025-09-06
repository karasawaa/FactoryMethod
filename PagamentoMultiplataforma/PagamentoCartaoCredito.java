public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean validarCartao() {
        return numeroCartao != null && numeroCartao.length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarCartao()) {
            return "Erro: Número do cartão inválido.";
        }
        return "Pagamento de R$" + valor + " realizado com cartão de crédito.";
    }
}