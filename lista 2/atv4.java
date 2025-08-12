package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv4 {

	public static void main(String[] args) {
		        Scanner leitura = new Scanner(System.in);
		        int ano;

		        System.out.print("Digite um ano: ");
		        ano = leitura.nextInt();

		        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
		            System.out.println(ano + " é um ano bissexto.");
		        } else {
		            System.out.println(ano + " não é um ano bissexto.");
		        }
		        leitura.close();
		    }
	}


