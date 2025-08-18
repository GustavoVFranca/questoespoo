package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv11 {
	public static void main (String[] args) {
		int par = 0, imp = 0; 
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("digite o " + i + " número: ");
			int num = sc.nextInt();
			if (num % 2 == 0) { 
				par = par + 1;
			}else {
				imp = imp + 1;
			}
		}
		System.out.println("A quantidade de números pares é " + par + " e a quantidade de impares é " + imp);
		sc.close();	
	}
}
