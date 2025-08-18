package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv18 {
	 public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();
	        int cont = 0;
			int [] div = new int[numero];
	        boolean primo = true;
	        if (numero <= 1) {
	            primo = false; 
	        } else {
	            for (int i = 2; i < numero; i++) { 
	                if (numero % i == 0) {
	                	div [cont] = i;
	                    primo = false;
	                    cont++;    
	                }
	            }
	        }
	        if (primo) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	            System.out.println(numero + " é divisivel por: ");
	            for (int i = 0; i < cont ; i++) {
	            System.out.println(div[i]);
	            }
	        }
	        sc.close();
	    }
	}