package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv16 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Quantos números deseja digitar? ");
	        int n = sc.nextInt();
	        double menor, maior;
	        double soma = 0;
	        System.out.print("Digite o 1 número: ");
	        double num = sc.nextDouble();
	        menor = num;
	        maior =  num;
	        soma = soma + num;
	        for (int i = 2; i <= n; i++) {
	            System.out.print("Digite o " + i + " número: ");
	            num = sc.nextDouble();
	            soma = soma + num;
	            if (num < menor) {
	                menor = (int) num;
	            }
	            if (num > maior) {
	                maior = (int) num;
	            }
	        }
	        System.out.println("Menor valor: " + menor);
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Soma dos valores: " + soma);
	        sc.close();
	    }
	}