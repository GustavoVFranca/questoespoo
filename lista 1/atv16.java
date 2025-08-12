package projects;
import java.util.Scanner;
public class atv16 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
			double areaMetros, litros, valorL, valorG; 
			int quantidadeLatas, quantidadeGaloes;
			 	System.out.println("digite a area para ser pintada em metros quadrados: ");
			 	areaMetros = leitura.nextDouble();
			 		litros = areaMetros / 6; 
			 		quantidadeLatas = (int) Math.ceil(litros / 18);
			 		quantidadeGaloes = (int) Math.ceil(litros / 3.6);
			 		valorL = quantidadeLatas * 80.00;
			 		valorG = quantidadeGaloes * 25.00;
			 	System.out.println("você vai precisar de " + litros + " litros");
			 	
			 	System.out.println ("");
			 	
			 	System.out.println("vai precisar de: " + quantidadeLatas + " latas de 18 litros");
			 	System.out.println("isso vai custar o valor de: " + valorL + " reais");
			 	
			 	System.out.println ("");
			 	
			 	System.out.println("ou você vai precisar de: " + quantidadeGaloes + " galoes de 3,6 litros");
			 	System.out.println("isso vai custar o valor de: " + valorG + " reais");
			 	leitura.close();
	}

}
