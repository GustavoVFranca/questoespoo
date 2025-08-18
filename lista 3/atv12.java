package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n1,n2,res;
		System.out.println("digite ate que número deseja ver a sequência de Fibonacci: ");
		n = sc.nextInt();
		res = 0;
		n1 = 0;
		n2 = 1;
		 for (int i = 0; i < n; i++) {
			 res = n1+n2;
			 n1 = n2;
			 n2 = res;
			  System.out.println(res);
		}
	sc.close();	
	}

}
