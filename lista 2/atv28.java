package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv28 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double num1, num2, resultado;
        int operacao;
        	System.out.println("Digite o primeiro número:");
        		num1 = leitura.nextDouble();
        	System.out.println("Digite o segundo número:");
        		num2 = leitura.nextDouble();
        	System.out.println("Escolha a operação: 1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão");
        		operacao = leitura.nextInt();
        			switch (operacao) {
        				case 1:
        					resultado = num1 + num2;
        				break;
        				case 2:
        					resultado = num1 - num2;
        				break;
        				case 3:
        					resultado = num1 * num2;
        				break;
        				case 4:
        					resultado = num1 / num2;
        				break;
        				default:
        					System.out.println("Operação inválida!");
        					leitura.close();
        				return;
        }
        						System.out.println("Resultado: " + resultado);
        							if (resultado % 2 == 0) {
        								System.out.println("O resultado é par.");
        							} else {
        								System.out.println("O resultado é ímpar.");
        							}
        							if (resultado >= 0) {
        								System.out.println("O resultado é positivo.");
        							} else {
        								System.out.println("O resultado é negativo.");
        							}
        							if (resultado % 1 == 0) {
        								System.out.println("O resultado é inteiro.");
        							} else {
        								System.out.println("O resultado é decimal.");
        							}
        leitura.close();
    }
}
