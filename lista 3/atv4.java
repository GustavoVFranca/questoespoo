package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv4 {
	public static void main(String[] args) {
		// Parte 1 da questão: 
		Scanner sc = new Scanner(System.in);
		double popA, popB, taxaA, taxaB;
		int i = 0;
		popA = 80.000;
		popB = 200.000;
		do {
			popA = popA + popA * 0.03;
			popB = popB + popB * 0.015;
			i++;	
		}while (popA < popB);
			System.out.println("Para a população A alcançar a população B vai demorar: "+ i + " anos.");
			// Parte 2 da questão (modificada):
		do { 
			i = 0;
			System.out.println("digite a pupulação da cidade A: ");
			popA = sc.nextDouble();
			System.out.println("digite a taxa de crescimento anual da cidade A em %: ");
			taxaA = sc.nextDouble() / 100;
			System.out.println("digite a pupulação da cidade B: ");
			popB = sc.nextDouble();
			System.out.println("digite a taxa de crescimento anual da cidade B em %: ");
			taxaB = sc.nextDouble() / 100;
				if (popA < 0 || popB < 0 || taxaA < 0 || taxaB < 0) { 
				System.out.println("erro: a população e a taxa devem ser maior que 0.");
				}
			}while (popA < 0 || popB < 0 || taxaA < 0 || taxaB < 0);
					if (popA == popB) {
						System.out.println("o tamanho das populações ja é igual.");
					} else {
							do {
								popA = popA + popA * taxaA;
								popB = popB + popB * taxaB;
								i++;	
							}while (popA < popB);
								System.out.println("Para a população A alcançar a população B vai demorar: "+ i + " anos.");
					}
					sc.close();
	}		
}
	
  