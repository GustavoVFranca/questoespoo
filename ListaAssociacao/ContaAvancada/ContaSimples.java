package ContaAvancada;
public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public ContaSimples(Banco banco, int agencia, int numeroDaConta, Pessoa correntista, double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroDaConta, correntista, saldo);
        setSaldoPoupanca(saldoPoupanca);
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        if (saldoPoupanca >= 0) {
            this.saldoPoupanca = saldoPoupanca;
        }
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && valor <= saldoPoupanca) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaSimples [saldoPoupanca=");
        builder.append(saldoPoupanca);
        builder.append(", ");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
