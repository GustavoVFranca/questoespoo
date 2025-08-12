package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv14 {
	  	public static void main (String[] args) {
	  		int num;
	  		Scanner leitura = new Scanner(System.in);
	        System.out.println("Digite um número (1 a 7): ");
	       num = leitura.nextInt();
	        String dia;
	        switch (num) {
	            case 1: dia = "Domingo"; break;
	            case 2: dia = "Segunda-feira"; break;
	            case 3: dia = "Terça-feira"; break;
	            case 4: dia = "Quarta-feira"; break;
	            case 5: dia = "Quinta-feira"; break;
	            case 6: dia = "Sexta-feira"; break;
	            case 7: dia = "Sábado"; break;
	            default: dia = "Valor inválido"; break;
	        }
	        System.out.println(dia);
	        leitura.close();
	    }
	}
