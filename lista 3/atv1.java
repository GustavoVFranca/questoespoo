package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv1 {
	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("digite uma nota de 0 a 10: ");
				nota = sc.nextDouble();
				if(nota > 10 || nota < 0 ){
					System.out.println("nota invalida.");
				}
			}while(nota > 10 || nota < 0);
			sc.close();
	}
}
