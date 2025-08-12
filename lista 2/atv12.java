package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv12 {

	public static void main(String[] args) {
		double salario, aumento;
			Scanner leitura = new Scanner(System.in);
			System.out.println("digite seu salario atual: ");
			salario = leitura.nextDouble();
			System.out.println("o salario era: " + salario);
				if (salario <= 280.00){
					aumento = salario*0.2;
					System.out.println("o aumento foi de 20%");
					System.out.println("o valor do aumento foi: " + aumento);
					System.out.println("o seu salario atual agora é: " + (salario + aumento) );
				}else if (salario > 280.00 && salario<= 700.00){
					aumento = salario*0.15;
					System.out.println("o aumento foi de 15%");
					System.out.println("o valor do aumento foi: " +aumento);
					System.out.println("o seu salario atual agora é: " + (salario + aumento) );
				}else if (salario > 700.00 && salario <= 1500){
					aumento = salario*0.1;
					System.out.println("o aumento foi de 10%");
					System.out.println("o valor do aumento foi: " +aumento);
					System.out.println("o seu salario atual agora é: " + (salario + aumento) );
				}else if (salario > 1500.00){
					aumento = salario*0.05;
					System.out.println("o aumento foi de 5%");
					System.out.println("o valor do aumento foi: " +aumento);
					System.out.println("o seu salario atual agora é: " + (salario + aumento) );					
				leitura.close();
		}

	}

}
