public class PagamentoPayPal implements Pagamento {
    private String emailUsuario;

    public PagamentoPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    private boolean validarContaPayPal() {
        // Simulação: e-mail termina com "@paypal.com" está vinculado
        return emailUsuario != null && emailUsuario.endsWith("@paypal.com");
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarContaPayPal()) {
            return "Erro: Conta PayPal não vinculada ao e-mail.";
        }
        return "Pagamento de R$" + valor + " realizado via PayPal.";
    }
}