package projects;
import java.util.Scanner;
public class atv2 {
 
	public static void main(String[] args) {
		int numero;
	System.out.println("digite um número inteiro: ");
		Scanner leitura = new Scanner(System.in);
			numero = leitura.nextInt();
		       System.out.println("O número informado foi: " + numero );
	
		       leitura.close();
	}

}
