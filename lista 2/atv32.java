package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv32 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String tipoCarne, cartao;
        double kgCarne, precoCarne, totalCarne, descontoCarne;
        	System.out.println("Digite o tipo de carne (File Duplo, Alcatra, Picanha): ");
        		tipoCarne = leitura.nextLine();
        	System.out.println("Digite a quantidade (Kg): ");
        		kgCarne = leitura.nextDouble();
        		leitura.nextLine();
        	System.out.println("Pagamento com cartão Tabajara? (s/n): ");
        		cartao = leitura.nextLine();
        	precoCarne = 0;
        			if (tipoCarne.equalsIgnoreCase("File Duplo")) {
        				precoCarne = (kgCarne <= 5) ? 4.90 : 5.80;
        			} else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
        				precoCarne = (kgCarne <= 5) ? 5.90 : 6.80;
        			} else if (tipoCarne.equalsIgnoreCase("Picanha")) {
        				precoCarne = (kgCarne <= 5) ? 6.90 : 7.80;
        			} else {
        				System.out.println("Tipo de carne inválido!");
        				leitura.close();
        			return;
        			}
        					totalCarne = kgCarne * precoCarne;
        					descontoCarne = 0;
        						if (cartao.equalsIgnoreCase("s")) {
        							descontoCarne = totalCarne * 0.05;
        							totalCarne -= descontoCarne;
        						}
        								System.out.println("CUPOM FISCAL");
        								System.out.println("Tipo de carne: " + tipoCarne);
        								System.out.println("Quantidade: " + kgCarne + " Kg");
        								System.out.println("Preço total: R$ " + (kgCarne * precoCarne));
        								System.out.println("Tipo de pagamento: " + (cartao.equalsIgnoreCase("s") ? "Cartão Tabajara" : "Outro"));
        								System.out.println("Desconto: R$ " + descontoCarne);
        								System.out.println("Valor a pagar: R$ " + totalCarne);
        leitura.close();
    }
}
