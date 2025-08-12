package projects;
import java.util.Scanner;
public class atv11 {

	public static void main(String[] args) {
	 Scanner leitura = new Scanner(System.in);
	 	float Altura;
	 		System.out.println("digite sua altura: ");
	 		    Altura = leitura.nextFloat();
	 		    	System.out.println("seu peso ideal é: " + (72.7*Altura - 58));
	 		    	leitura.close();
	 		
	}

}
