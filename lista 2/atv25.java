package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv25{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor, notas100, notas50, notas10, notas5, moedas1;
        	System.out.println("Digite o valor do saque (entre 10 e 600):");
        		valor = leitura.nextInt();
        		notas100 = valor / 100;
        		valor %= 100;
        		notas50 = valor / 50;
        		valor %= 50;
        		notas10 = valor / 10;
        		valor %= 10;
        		notas5 = valor / 5;
        		valor %= 5;
        		moedas1 = valor;
        	System.out.println("Notas de 100: " + notas100);
        	System.out.println("Notas de 50: " + notas50);
        	System.out.println("Notas de 10: " + notas10);
        	System.out.println("Notas de 5: " + notas5);
        	System.out.println("moedas de 1: " + moedas1);
        leitura.close();
    }
}
