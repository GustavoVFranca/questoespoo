package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv25 {
	public static void main(String[] args) {
		double preco = 1.99;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + preco );
		preco = 1.99 * (i+1);
		}
		sc.close();
	}
}
