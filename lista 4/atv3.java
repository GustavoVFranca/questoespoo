package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 4;
		double soma = 0;
		Double [] notas = new Double[TAM];
		for(int i = 0; i < TAM; i++) {
			System.out.println("digite a nota " + (i+1) + ":");
			notas[i] = sc.nextDouble();
			soma += notas[i];
		}
		for(int i = 0; i < 4; i++) {
			System.out.println("nota " + (i+1) + ": " + notas[i]);
		}
		System.out.println("media: " + soma/TAM);							
		sc.close();
	}
}
