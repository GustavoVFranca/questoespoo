package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv27 {

	public static void main(String[] args) {
		double valor = 0, preco = 0;
		boolean repetir = true;
		String validacao;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Lojas Tabajara");
			System.out.println("digite os valores das mercadorias:");
			do {
				preco = sc.nextDouble();
				System.out.println("produto " + i + ": R$" + preco);
				valor = valor + preco;
				i++;
			}while (preco != 0);
				System.out.println("Total: " + valor);
				System.out.println("dinheiro: ");
				double dinheiro = sc.nextDouble();
				System.out.println("Troco: " + (dinheiro - valor));
				System.out.println("proxima compra? (S/N)");
				validacao = sc.next();
				if (validacao.equalsIgnoreCase("S")){
				repetir = true;
				}else {
					repetir = false;
				}			
		}while (repetir);	
		sc.close();
	}

}
