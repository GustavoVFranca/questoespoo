package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv5 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		char letra;
		System.out.println("digite uma letra: ");
		letra = leitura.next().charAt(0);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
		    System.out.println("a letra é vogal.");
		} else {
		    System.out.println("a letra não é vogal.");
		}
		leitura.close();
	  }	
	}
