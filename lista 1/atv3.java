package projects;
import java.util.Scanner;
public class atv3 {
	
	public static void main(String[] args) {
		int num1, num2;
			Scanner leitura = new Scanner (System.in);
				System.out.println("Digite o primeiro número: ");
				 num1 = leitura.nextInt();
				System.out.println("Digite o segundo número: ");
				 num2 = leitura.nextInt();
			System.out.println("a soma dos dois números é : " + (num1+num2)); 
			leitura.close();
	}

}
