package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] primeiro = new int[10];
		int [] segundo = new int[10];
		int [] terceiro = new int[20];
		for(int i = 0; i < 10; i++) {
		System.out.println(i+1 + " numero do primeiro vetor: ");
		primeiro[i] = sc.nextInt();
		System.out.println(i+1 + " numero do segundo vetor:");
		segundo[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = 0 ; i < 10; i++) {			
				terceiro[j] = primeiro[i];	
				j++;			
				terceiro[j] = segundo[i];	
				j++;
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println("numero " +  i + ": " + terceiro[i]);
		}						
		sc.close();
	}

}
