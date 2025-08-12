package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv30 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String tipoCombustivel;
        double litros, precoLitro, desconto, total;
        	System.out.println("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        		tipoCombustivel = leitura.nextLine();
        	System.out.println("Digite a quantidade de litros: ");
        		litros = leitura.nextDouble();
        			if (tipoCombustivel.equalsIgnoreCase ("a")) {
        				precoLitro = 1.90;
        				desconto = (litros <= 20) ? 0.03 : 0.05;
        			} else {
        				precoLitro = 2.50;
        				desconto = (litros <= 20) ? 0.04 : 0.06;
        			}
        				total = litros * precoLitro;
        				total -= total * desconto;
        	System.out.println("Valor a pagar: R$ " + total);
        leitura.close();
    }
}
