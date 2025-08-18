package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorDivida;
        double valorJuros;
        double valorTotal;
        double valorParcela;
        int[] parcelas = {1, 3, 6, 9, 12};
        int[] juros = {0, 10, 15, 20, 25};
        System.out.println("Digite o valor da dívida: ");
        valorDivida = sc.nextDouble();
        System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");
        for (int i = 0; i < 5; i++) {
            valorJuros = valorDivida * (juros[i] / 100.0);
            valorTotal = valorDivida + valorJuros;
            valorParcela = valorTotal / parcelas[i];
            System.out.println("R$ " + valorTotal + "               "  +  valorJuros + "               " + parcelas[i] + "               " + valorParcela);
        }
        sc.close();
    }
}
