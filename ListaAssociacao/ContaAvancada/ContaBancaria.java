package ContaAvancada;
public class ContaBancaria {
    protected Banco banco;
    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Pessoa correntista;

    public ContaBancaria(Banco banco, int agencia, int numeroDaConta, Pessoa correntista, double saldo) {
        this.banco = banco;
        setAgencia(agencia);
        setNumeroDaConta(numeroDaConta);
        setCorrentista(correntista);
        setSaldo(saldo);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if (numeroDaConta > 0) {
            this.numeroDaConta = numeroDaConta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaBancaria [banco=");
        builder.append(banco);
        builder.append(", agencia=");
        builder.append(agencia);
        builder.append(", numeroDaConta=");
        builder.append(numeroDaConta);
        builder.append(", saldo=");
        builder.append(saldo);
        builder.append(", correntista=");
        builder.append(correntista);
        builder.append("]");
        return builder.toString();
    }
}

