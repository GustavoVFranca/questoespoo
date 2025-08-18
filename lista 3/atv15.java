package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv15 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 37, m = 38;
		double s = 0;
		for (int i = 1; i <= 37; i++) {
			s = s + (n*m)/i;
			n--;
			m--;
		}
		System.out.println("S = " + s);		
		sc.close();
	}
}
