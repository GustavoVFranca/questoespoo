package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv24 {
	public static void main(String[] args) {
		double med = 0,valor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite quantos CDs você possui: ");
		int cds = sc.nextInt();
		for (int i = 1; i <= cds; i++) {
			System.out.println("digite o valor do " + i + " cd: ");
			valor = valor + sc.nextDouble();
		}
		med = valor / cds;
		System.out.println("o valor gasto na coleção foi " + valor + " e teve uma media de gasto por CD de " + med);
		sc.close();
	}

}
