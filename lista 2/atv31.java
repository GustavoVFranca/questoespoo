package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv31 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double kgMorangos, kgMacas, precoMorango, precoMaca, totalFrutas;
        	System.out.println("Digite a quantidade (Kg) de morangos: ");
        		kgMorangos = leitura.nextDouble();
        	System.out.println("Digite a quantidade (Kg) de maçãs: ");
        		kgMacas = leitura.nextDouble();
        		precoMorango = (kgMorangos <= 5) ? 2.50 : 2.20;
        		precoMaca = (kgMacas <= 5) ? 1.80 : 1.50;
        		totalFrutas = (kgMorangos * precoMorango) + (kgMacas * precoMaca);
        			if (kgMorangos + kgMacas > 8 || totalFrutas > 25) {
        				totalFrutas = totalFrutas * 0.90;
        			}
        System.out.println("Valor a pagar: R$ " + totalFrutas);
        leitura.close();
    }
}
