package projects;
import java.util.Scanner;
public class atv8 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		float Salario,Horas;
		System.out.println("digite quanto você ganha por hora: ");
			Salario = leitura.nextFloat();
		System.out.println("digite quantas horas você trabalha por mês: ");
			Horas = leitura.nextFloat();
		System.out.println("seu salario mensal é: " + Salario*Horas);
		
		leitura.close();
	}

}
