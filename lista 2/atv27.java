package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv27 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numero;
        	System.out.println("Digite um número:");
        		numero = leitura.nextDouble();
        			if (numero % 1 == 0) {
        				System.out.println("O número é inteiro.");
        			} else {
        				System.out.println("O número é decimal.");
        			}
        leitura.close();
    }
}
