package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv26 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        	System.out.println("Digite um número inteiro:");
        		numero = leitura.nextInt();
        			if (numero % 2 == 0) {
        				System.out.println("O número é par.");
        			} else {
        				System.out.println("O número é ímpar.");
        			}
        leitura.close();
    }
}
