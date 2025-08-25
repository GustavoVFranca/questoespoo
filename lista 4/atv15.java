package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int num;
		int [] numeros = new int[N];
		for(int i = 0; i < N; i++) {
			do {
				System.out.println("digite o " + (i+1) + " numero: ");
				num = sc.nextInt();
				if (num < 0 || num > 20) {
					System.out.println("erro: o numero precisa estar entre 0 e 20.");
				}
			}while (num < 0 || num > 20);
			numeros[i] = num;
		}
		for (int i = 0; i < N; i++) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        sc.close();
    }		
}
