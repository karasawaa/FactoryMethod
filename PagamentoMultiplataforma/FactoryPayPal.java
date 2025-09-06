public class FactoryPayPal extends PagamentoFactory {
    private String emailUsuario;

    public FactoryPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPayPal(emailUsuario);
    }
}