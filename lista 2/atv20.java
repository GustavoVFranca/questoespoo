package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int ano;
        boolean bissexto;
        	System.out.print("Digite um ano: ");
        		ano = leitura.nextInt();
        		bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
        			if (bissexto) {
        				System.out.println("O ano " + ano + " é bissexto.");
        			} else {
        				System.out.println("O ano " + ano + " não é bissexto.");
        			}
        leitura.close();
    }
}
