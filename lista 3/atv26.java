package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o preço do pão: ");
		double valor = sc.nextDouble();
		double preco;
		for (int i = 1; i <= 50; i++) {
			preco = valor * i;
			System.out.println(i + " - R$ " + preco );
		
		}
		sc.close();
	}
}
