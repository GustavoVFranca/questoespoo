package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv29 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int respostaSim = 0;
        String resp;
        	System.out.println("Telefonou para a vítima? (s/n): ");
        		resp = leitura.nextLine().trim();
        			if (resp.equalsIgnoreCase("s")) respostaSim++;
        				System.out.println("Esteve no local do crime? (s/n): ");
        				resp = leitura.nextLine().trim();
        			if (resp.equalsIgnoreCase("s")) respostaSim++;
        				System.out.println("Mora perto da vítima? (s/n): ");
        				resp = leitura.nextLine().trim();
        			if (resp.equalsIgnoreCase("s")) respostaSim++;
        				System.out.println("Devia para a vítima? (s/n): ");
        				resp = leitura.nextLine().trim();
        			if (resp.equalsIgnoreCase("s")) respostaSim++;
        				System.out.println("Já trabalhou com a vítima? (s/n): ");
        				resp = leitura.nextLine().trim();
        			if (resp.equalsIgnoreCase("s")) respostaSim++;
        			if (respostaSim == 2) {
        				System.out.println("Classificação: Suspeita");
        			} else if (respostaSim == 3 || respostaSim == 4) {
        				System.out.println("Classificação: Cúmplice");
        			} else if (respostaSim == 5) {
        				System.out.println("Classificação: Assassino");
        			} else {
        				System.out.println("Classificação: Inocente");
        			}
        leitura.close();
    }
}
