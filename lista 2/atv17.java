package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv17 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double n1, n2, media;
        String conceito, situacao;
        	System.out.print("Digite a primeira nota: ");
        		n1 = leitura.nextDouble();
        	System.out.print("Digite a segunda nota: ");
        		n2 = leitura.nextDouble();
        		media = (n1 + n2) / 2;
        			if (media >= 9) {
        				conceito = "A";
        			} else if (media >= 7.5) {
        				conceito = "B";
        			} else if (media >= 6) {
        				conceito = "C";
        			} else if (media >= 4) {
        				conceito = "D";
        			} else {
        				conceito = "E";
        			}
        			if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
        				situacao = "APROVADO";
        			} else {
        				situacao = "REPROVADO";
        			}
        				System.out.println("Notas: " + n1 + " e " + n2);
        				System.out.println("Média: " + media);
        				System.out.println("Conceito: " + conceito);
        				System.out.println("Situação: " + situacao);
        leitura.close();
    }
}
