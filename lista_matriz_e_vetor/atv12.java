package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idades [] = new int [5];
		double alturas [] = new double [5];
		double somaI = 0, somaA = 0 ,alto = 0 ,baixo = 99999 ;
		int velho = 0, novo = 9999;
		for (int i = 0; i < 5; i++) {
			System.out.println("digite sua idade: ");
			idades[i] = sc.nextInt();
			System.out.println("digite sua altura: ");
			alturas[i] = sc.nextDouble();
			somaI += idades[i];
			somaA += alturas[i];
			if(idades[i] > velho) {
				velho = idades[i];
			}
			if(idades[i] < novo) {
				novo = idades[i];
			}
			if(alturas[i] > alto) {
				alto = alturas[i];
			}
			if(alturas[i] < baixo) {
				baixo = alturas[i];
			}																			
		}				
		for(int i = 4; i >= 0; i--) {
			System.out.println("altura do numero " + (i+1) + ": " + alturas[i]);
			System.out.println("idade do numero " + (i+1)  + ": " + idades[i]);
		}
		System.out.println("o mais velho tem: " + velho);
		System.out.println("o mais novo tem: " + novo);
		System.out.println("o mais alto tem: " + alto);
		System.out.println("o mais baixo tem: " + baixo);
		double medA = somaA/5;	
		double medI = somaI/5;
		System.out.println("media de altura: " + medA);
		System.out.println("media de idade: " + medI);
		for(int i = 0; i < 5; i++) {
			if (alturas[i] >= medI) {
				System.out.println(alturas[i] + " esta igual ou acima da media de alturas.");		
			}else if (alturas[i] < medI) {
				System.out.println(alturas[i] + " esta abaixo da media de alturas.");		
			}
			if(idades[i] >= medI) {
				System.out.println(idades[i] + " esta igual ou acima da media de alturas.");
			}else if (idades[i] < medI) {
				System.out.println(idades[i] + " esta abaixo da media de idades.");
			}
		}
		sc.close();
	}

}
