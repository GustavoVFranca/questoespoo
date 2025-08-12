package lista_estruturas_de_seleção;
import java.util.Arrays;
import java.util.Scanner;
public class atv7 {

	public static void main(String[] args) {
		        Scanner leitura = new Scanner(System.in);
		        int[] numeros = new int[3]; 
		        for (int i = 0; i < 3; i++) {
		            System.out.print("Digite o " + (i + 1) + " número: ");
		            numeros[i] = leitura.nextInt();
		        }
		        Arrays.sort(numeros);
		        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
		        leitura.close();
		        }
		    }
	


