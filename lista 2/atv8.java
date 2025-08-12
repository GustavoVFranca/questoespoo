package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv8 {

	public static void main(String[] args) {
		double n1, n2, media;
		        Scanner leitura = new Scanner(System.in);
		        	System.out.print("Digite a primeira nota: ");
		        		 n1 = leitura.nextDouble();
		        	System.out.print("Digite a segunda nota: ");
		        		 n2 = leitura.nextDouble();
		        		 media = (n1 + n2) / 2;
		        		 	System.out.println("sua media ficou: " + media);
		        			if (media >= 7) {
		        				System.out.println("Aprovado");
		        			} else {
		        				System.out.println("Reprovado");
		        }	
		        			leitura.close();
		    }
	}
