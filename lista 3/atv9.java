package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		int tab;
		System.out.println("digite um número de 1 a 10 para ver a tabuada: ");
		tab = sc.nextInt();
			if (tab < 10 && tab > 0) {
				System.out.println("a tabuada de " + tab + " é: ");
				for(int i = 0; i <= 10; i++) {
					
					System.out.println(tab + " x " + i + " = " + tab*i);		
				}
			}else {
				System.out.println("erro: o numero deve estar entre 1 e 10");	
			sc.close();
			}		
	}
}
