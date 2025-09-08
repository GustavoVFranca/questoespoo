package lista_intro_POO;
public class pedidos_classe {
    private int codigo;
    private int quantidade;
    private String nome;
    private double preco;

    public pedidos_classe(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        definirProduto();
    }

    private void definirProduto() {
        if (codigo == 100) {
            nome = "Cachorro Quente";
            preco = 1.20;
        } else if (codigo == 101) {
            nome = "Bauru Simples";
            preco = 1.30;
        } else if (codigo == 102) {
            nome = "Bauru com ovo";
            preco = 1.50;
        } else if (codigo == 103) {
            nome = "Hamburguer";
            preco = 1.20;
        } else if (codigo == 104) {
            nome = "Cheeseburguer";
            preco = 1.30;
        } else if (codigo == 105) {
            nome = "Refrigerante";
            preco = 1.00;
        } else {
            nome = "Código inválido";
            preco = 0;
        }
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
