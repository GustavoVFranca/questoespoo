package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv16 {
    public static void main(String[] args) {
    	double soma, media;
    	String resultado;
        Scanner leitura = new Scanner(System.in);
        soma = 0;
        	for (int i = 1; i <= 3; i++) {
        		System.out.print("Digite a nota " + i + ": ");
        			soma += leitura.nextDouble();
        	}
        	media = soma / 3;
        		if (media < 3) {
        			resultado = "Reprovado";
        		} else if (media <= 6.9) {
        			resultado = "Em Exame";
        		} else {
        			resultado = "Aprovado";
        		}
        			System.out.println("Média: " + media);
        			System.out.println(" Situação: " + resultado);
        leitura.close();
    }
}

