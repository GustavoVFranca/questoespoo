package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n1, n2, n3, maior, menor;
        	System.out.print("Digite o primeiro número: ");
        		n1 = leitura.nextInt();
        	System.out.print("Digite o segundo número: ");
        		n2 = leitura.nextInt();
        	System.out.print("Digite o terceiro número: ");
        		n3 = leitura.nextInt();
        			maior = Math.max(n1, Math.max(n2, n3));
        			menor = Math.min(n1, Math.min(n2, n3));
        				System.out.println("Maior número: " + maior);
        				System.out.println("Menor número: " + menor);

        				leitura.close();
    }
}
