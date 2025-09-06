public class PagamentoCriptomoeda implements Pagamento {
    private double saldoCarteira;

    public PagamentoCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    private boolean validarSaldo(double valor) {
        return saldoCarteira >= valor;
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarSaldo(valor)) {
            return "Erro: Saldo insuficiente na carteira de criptomoedas.";
        }
        saldoCarteira -= valor;
        return "Pagamento de R$" + valor + " realizado via criptomoeda.";
    }
}