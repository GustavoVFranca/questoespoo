package projects;
import java.util.Scanner;
public class atv13 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
			double peso, excesso, multa;
			final double limite = 50.0; 
			final double multa_kg = 4.0;
				System.out.println("digite o peso dos peixem em kg: ");
				peso = leitura.nextDouble();
				excesso = peso - limite;
				multa = 0;
					if (excesso > 0) { 
						multa = excesso * multa_kg;
						System.out.println("o peso é: "+ peso + "kg");
						System.out.println("teve um excesso de: "+ excesso + "kg");
						System.out.println("a multa sera no valor de: " + multa + " reais.");
					} 
					else { 
						System.out.println("o peso é: "+ peso);
						System.out.println("ficou: "+ excesso + " kg abaixo do limite de peso permitido");
						System.out.println("não sera aplicada nenhuma multa.");
					}
					leitura.close();
	}

}
