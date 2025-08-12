package projects;
import java.util.Scanner;
public class atv5 {

	public static void main(String[] args) {
		double M, Cm;
		Scanner leitura = new Scanner(System.in);
			System.out.println("digite o numero em M para converter para CM: ");
			  M = leitura.nextDouble();
			  Cm = M * 100;
			  	System.out.println("seu valor em centímetros é: " + Cm);
			  	leitura.close();
	}

}
