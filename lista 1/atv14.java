package projects;
import java.util.Scanner;
public class atv14 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double salarioB,horas,salarioL,INSS, imposto, sindicato;
		System.out.println("digite quanto você ganha por hora: ");
			salarioB = leitura.nextDouble();
		System.out.println("digite quantas horas você trabalha por mês: ");
			horas = leitura.nextDouble();
				salarioB = salarioB*horas;
				INSS = salarioB * 0.08;
				imposto = salarioB * 0.11;
				sindicato = salarioB * 0.05;
				salarioL = salarioB - INSS - imposto - sindicato;
					System.out.println("o salario bruto é: " + salarioB + " reais");
					System.out.println("Pagou de INSS: " + INSS + "reais");
					System.out.println("pagou de imposto de renda: " + imposto + " reais");
					System.out.println("pagou para o sindicato: "+ sindicato + " reais");
					System.out.println("o salario liquido é: " + salarioL + " reais");
					
					leitura.close();
				
	}
}