package lista_intro_POO;
public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Abastecido: %.2f litros%n", litros);
        } else {
            System.out.println("Quantidade insuficiente de combustível na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivel) {
            double valor = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.printf("Valor a pagar: R$ %.2f%n", valor);
        } else {
            System.out.println("Quantidade insuficiente de combustível na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public void statusBomba() {
        System.out.printf("Tipo: %s | Preço por litro: R$ %.2f | Quantidade disponível: %.2f litros%n",
                          tipoCombustivel, valorLitro, quantidadeCombustivel);
    }
}
