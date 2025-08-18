package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv8 {
 public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("digite o primeiro número do intervalo: ");
	 	int numA = sc.nextInt();
	 System.out.println("digite o segundo número do intervalo: ");
	 	int numB = sc.nextInt();
	 		if(numA > numB) {
	 			int troca = numB;
	 			numB = numA;
	 			numA = troca;
	 		}
	 		int i = numA;
	 		int soma = 0;
	 	do {
	 		soma = soma + i;
	 		System.out.print(i +  " ");
	 		i++;
	 	}while (i <= numB); 	
	 	System.out.println();
	 	System.out.println("a soma dos números presentes no intervalo é: " + soma);
	  sc.close();
			 }
}
