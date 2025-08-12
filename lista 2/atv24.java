package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv24 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        	System.out.println("Digite a primeira nota:");
        		nota1 = leitura.nextDouble();
        	System.out.println("Digite a segunda nota:");
        		nota2 = leitura.nextDouble();
        	System.out.println("Digite a terceira nota:");
        		nota3 = leitura.nextDouble();
        		media = (nota1 + nota2 + nota3) / 3;
        			if (media == 10) {
        				System.out.println("Aprovado com Distinção - Média: " + media);
        			} else if (media >= 7) {
        				System.out.println("Aprovado - Média: " + media);
        			} else {
        				System.out.println("Reprovado - Média: " + media);
        			}
        leitura.close();
    }
}
