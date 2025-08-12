package projects;
import java.util.Scanner;
public class atv4 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		 	float n1,n2,n3,n4;
		 		System.out.println("digite sua primeira nota: ");	
		 			n1 = leitura.nextFloat();
		 		System.out.println("digite sua segunda nota: ");
		 		 	n2 = leitura.nextFloat();
		 		System.out.println("digite sua terceira nota: ");
		 			n3 = leitura.nextFloat();
		 		System.out.println("digite sua quarta nota: ");
		 			n4 = leitura.nextFloat();						 		
		 				System.out.println("sua média é: "+ (n1+n2+n3+n4)/4);
		 				leitura.close();
	}

}
