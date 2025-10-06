package ContaAvancada;
public class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    private CartaoDeCredito cartao;

    public ContaEspecial(Banco banco, int agencia, int numeroDaConta, Pessoa correntista, double saldo,
                         int diasSemJuros, double limite, CartaoDeCredito cartao) {
        super(banco, agencia, numeroDaConta, correntista, saldo);
        setDiasSemJuros(diasSemJuros);
        setLimite(limite);
        this.cartao = cartao;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        if (diasSemJuros >= 0) {
            this.diasSemJuros = diasSemJuros;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        }
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaEspecial [diasSemJuros=");
        builder.append(diasSemJuros);
        builder.append(", limite=");
        builder.append(limite);
        builder.append(", cartao=");
        builder.append(cartao);
        builder.append(", ");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
