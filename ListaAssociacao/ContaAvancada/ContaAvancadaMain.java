package ContaAvancada;
public class ContaAvancadaMain {
    public static void main(String[] args) {
        Banco b = new Banco(1, "Banco Central", 25);
        Pessoa p = new Pessoa("Carlos Silva", "Rua das Flores, 123");
        CartaoDeCredito cartao = new CartaoDeCredito(1001, "Visa", 5000, "Gold");

        ContaSimples contaS = new ContaSimples(b, 123, 4567, p, 2000, 500);
        ContaEspecial contaE = new ContaEspecial(b, 321, 7654, p, 3000, 10, 1000, cartao);

        System.out.println(contaS);
        System.out.println(contaE);
    }
}
