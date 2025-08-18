package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int res = 1;
			System.out.println("digite um número para ser a base: ");
			int base = sc.nextInt();
			System.out.println("digite um número para ser o expoente: ");
			int exp = sc.nextInt();
				for(int i = 1; i <= exp; i++) {
				res = res*base;
				}
			System.out.println("a base " + base + " elevada ao expoente " + exp + " é: " + res);
		sc.close();
	}
}
