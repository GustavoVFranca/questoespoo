package projects;
import java.util.Scanner;
public class atv6 {

	public static void main(String[] args) {
		double R, Area;
			Scanner leitura = new Scanner(System.in);		
				System.out.println("digite o Raio do circulo: ");
				 R = leitura.nextDouble();
				 Area = 3.14 * (R*R);
				System.out.println("A area do circulo é: " + Area);
				 
				leitura.close();
		
		
		

	}

}
