package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
    	int codigo;
    	double preco;
    	String procedencia;
        Scanner leitura = new Scanner(System.in);
        	System.out.print("Digite o código de origem do produto: ");
        		codigo = leitura .nextInt();
        	System.out.print("Digite o preço de custo: ");
        		preco = leitura .nextDouble();
        switch (codigo) {
            case 1: procedencia = "Sul"; break;
            case 2: procedencia = "Norte"; break;
            case 3: procedencia = "Leste"; break;
            case 4: procedencia = "Oeste"; break;
            case 5: 
            case 6: procedencia = "Nordeste"; break;
            case 7:
            case 8: procedencia = "Centro-Oeste"; break;
            default: procedencia = "Importado"; break;
        }
        System.out.println("Preço: " + preco + " Procedência: " + procedencia);
        leitura .close();
    }
}
