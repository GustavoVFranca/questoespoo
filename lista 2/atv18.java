package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double a, b, c;
        	System.out.print("Digite o lado 1: ");
        		a = leitura.nextDouble();
        	System.out.print("Digite o lado 2: ");
        		b = leitura.nextDouble();
        	System.out.print("Digite o lado 3: ");
        		c = leitura.nextDouble();
        			if (a + b > c && a + c > b && b + c > a) {
        				System.out.println("Os lados formam um triângulo.");
        			if (a == b && b == c) {
        				System.out.println("Tipo: Equilátero");
        			} else if (a == b || a == c || b == c) {
        				System.out.println("Tipo: Isósceles");
        			} else {
        				System.out.println("Tipo: Escaleno");
        			}
        			} else {
        				System.out.println("Os lados NÃO formam um triângulo.");
        			}
        leitura.close();
    }
}
