package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv20 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o total de notas: ");
		int quant = sc.nextInt();
		double nota = 0;
		 for(int i = 1; i <= quant; i++) {
			 System.out.println("digite sua " + i + " nota:");
			 nota = nota + sc.nextDouble();
			}
		 double media = nota / quant;
		 System.out.println("sua média é: " + media);
		 sc.close();
		 }
		
		
		
	}
