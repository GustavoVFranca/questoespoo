package projects;
import java.util.Scanner;
public class atv15 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
			double metrosQ, litros, valor, latas;
			 	System.out.println("digite a area para ser pintada em metros quadrados: ");
			 	metrosQ = leitura.nextDouble();
			 		litros = metrosQ / 3; 
			 		latas = Math.ceil(litros / 18); 
			 		valor = latas * 80.00;
			 	System.out.println("você vai precisar de " + litros + " litros");
			 	System.out.println("vai precisar de: " + latas + " latas");
			 	System.out.println("isso vai custar o valor de: " + valor + " reais");
			 	    
			 	leitura.close();
	}

}
