package projects;
import java.util.Scanner;
public class atv9 {

	public static void main(String[] args) {
		float F,C; 
	Scanner leitura = new Scanner(System.in);
	System.out.println("digite a temperatura em farenheit: ");
	  F = leitura.nextFloat();
	  C = (5 * (F-32) / 9);
	 System.out.println("a temperatura em celsius é: " + C);
	 leitura.close();
	}

}
