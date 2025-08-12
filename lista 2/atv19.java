package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv19 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double a, b, c, delta, raiz, raiz1, raiz2;
        	System.out.print("Digite o valor de a: ");
        		a = leitura.nextDouble();
        			if (a == 0) {
        				System.out.println("Não é uma equação do segundo grau.");
        				leitura.close();
        				return;
        			}
        				System.out.print("Digite o valor de b: ");
        					b = leitura.nextDouble();
        				System.out.print("Digite o valor de c: ");
        					c = leitura.nextDouble();
        					delta = b * b - 4 * a * c;
        						if (delta < 0) {
        							System.out.println("A equação não possui raízes reais.");
        						} else if (delta == 0) {
        							raiz = -b / (2 * a);
        							System.out.println("A equação possui uma raiz real: " + raiz);
        						} else {
        							raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        							raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        							System.out.println("A equação possui duas raízes reais:");
        							System.out.println("x1 = " + raiz1);
        							System.out.println("x2 = " + raiz2);
        						}
        leitura.close();
    }
}
