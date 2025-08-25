package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
				final int TAM = 20;
				int [] num = new int[TAM];	
				int [] par = new int[TAM];
				int [] impar = new int[TAM];
				int contP = 0, contI = 0;
				for (int i = 0 ; i < TAM; i++) {
					System.out.println("digite o número da posição " + (i+1) + " do vetor:");
					num[i] = sc.nextInt();
					if(num[i] % 2 == 0) {
						par[contP] = num[i];
						contP++;
					}else {
						impar[contI] = num[i];
						contI++;
					}
				}
				System.out.println("numeros: ");
				for(int i = 0 ; i < TAM; i++) {
					System.out.print("[" + num[i] + "] ");				
				}		
				System.out.println("\npares: ");
				for(int i = 0 ; i < contP; i++) {
					System.out.print("[" + par[i] + "] ");				
				}	
				System.out.println("\nimpares: ");
				for(int i = 0 ; i < contI; i++) {
					System.out.print("[" + impar[i] + "] ");				
				}	
		sc.close();
	}
}
