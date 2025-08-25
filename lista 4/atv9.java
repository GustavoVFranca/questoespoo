package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o texto:");
		String texto = sc.nextLine();
		int tam = texto.length();	
		char [] letras = new char[tam];
		for(int i = 0; i < tam; i++) {
			letras[i] = texto.charAt(i);
		}
		for(int i = 0; i < tam; i++) {
			System.out.println("letra na posição " + i + ": " + letras[i]);
		}
		sc.close();
	}
}
