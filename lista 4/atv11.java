package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o texto separando as palavras com (;): ");
		String [] palavras = sc.nextLine().split(";");
		int tam = palavras.length;
		for(int i = 0; i < tam; i++) {
			System.out.println("posição " + i + " do vetor palavra: " + palavras[i]);
		}												
		sc.close();
	}

}
