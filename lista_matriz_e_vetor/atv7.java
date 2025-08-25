package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv7 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 5;
		double soma = 0, multi = 1;
		int [] num = new int[TAM];		
		for (int i = 0; i < TAM; i++) {
			System.out.println("digite o número da posição " + (i+1) + " do vetor:");
			num[i] = sc.nextInt();
			soma += num[i];
			multi *= num[i];
		}
		for(int i = 0; i < TAM; i++) {
			System.out.print("[" + num[i] + "]");
		}
		System.out.println("\nsoma: " + soma);
		System.out.println("multiplicação:  " + multi);
		sc.close();
	}

}
