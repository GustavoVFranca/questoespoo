package lista_intro_POO;
public class contaBanco {
    private int numeroConta;
    private String nome;
    private double saldo;

    public contaBanco(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void incluirConta(int numero, String nomeTitular, double saldoInicial) {
        this.numeroConta = numero;
        this.nome = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
