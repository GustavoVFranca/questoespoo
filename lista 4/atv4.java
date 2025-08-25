package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 10;
		int cont = 0;
		char [] caracteres = new char[TAM];
		for (int i = 0; i < TAM; i++) {
			System.out.println("digite um caractere: ");
			caracteres[i] = Character.toLowerCase(sc.next().charAt(0));
			if(caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o' && caracteres[i] != 'u') {
				cont++;			
			}
		}
		System.out.println("foram lidas " + cont + " consoantes.");
		for (int i = 0; i < TAM; i++) {
			if(caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o' && caracteres[i] != 'u') {
			System.out.print(caracteres[i] + " ");
			}
		}
		
		
		
		
		sc.close();
	}

}
