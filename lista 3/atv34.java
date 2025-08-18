package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv34 {
	public static void main(String[] args) {
		int num;
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite os números(números negativo param a contagem):");
		while (true) {
			num = sc.nextInt();
			if(num < 0) {
				break;
			}
			if (num >= 0 && num <= 25) {
				cont1++;
			}
			if (num >= 26 && num <= 50) {
				cont2++;
			}
			if (num >= 51 && num <= 75) {
				cont3++;
			}
			if (num >= 76 && num <= 100) {
				cont4++;
				}
		}
			System.out.println("a quantidade de números entre [0-25] é: " + cont1);
			System.out.println("a quantidade de números entre [26-50] é: " + cont2);
			System.out.println("a quantidade de números entre [51-75] é: " + cont3);
			System.out.println("a quantidade de números entre [76-100] é: " + cont4);
			sc.close();
	}			
}

