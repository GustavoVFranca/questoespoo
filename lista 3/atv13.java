package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,res;
		System.out.println("digite o número que deseja ver a fatorial: ");
		n = sc.nextInt();
		res = n;
			for (int i = n - 1; i != 0; i--) {
				res = res * i;			
			}
			System.out.println(n + "! = " + res);			
		sc.close();
	}

}
