package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero, centenas, dezenas, unidades;
        	System.out.println("Digite um número inteiro menor que 1000:");
        		numero = leitura.nextInt();
        		centenas = numero / 100;
        		dezenas = (numero % 100) / 10;
        		unidades = numero % 10;
        	System.out.println(numero + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");      
        leitura.close();
    }
}
