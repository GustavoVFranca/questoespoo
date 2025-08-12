package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv13 {

	public static void main(String[] args) {
		double valorHora, salarioBruto, ir, sindicato, inss,fgts, salarioLiquido, descontos;
		int horas;
		  Scanner leitura = new Scanner(System.in);
		        	System.out.print("Digite o valor da hora: ");
		        		valorHora = leitura.nextDouble();
		        	System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		        		horas = leitura.nextInt();
		        		salarioBruto = valorHora * horas;
		        		ir = 0;
		        			if (salarioBruto > 900 && salarioBruto <= 1500) {
		        				ir = salarioBruto * 0.05;
		        			} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		        				ir = salarioBruto * 0.10;
		        			} else if (salarioBruto > 2500) {
		        				ir = salarioBruto * 0.20;
		        			}
		        					sindicato = salarioBruto * 0.03;
		        					inss = salarioBruto * 0.10;
		        					fgts = salarioBruto * 0.11;
		        					descontos = ir + sindicato + inss;
		        					salarioLiquido = salarioBruto - descontos;
		        						System.out.println("Salário Bruto: " + salarioBruto);
		        						System.out.println("IR: " + ir);
		        						System.out.println("Sindicato : " + sindicato);
		        						System.out.println("INSS : " +inss);
		        						System.out.println("FGTS : "+ fgts);
		        						System.out.println("Total de descontos: " + descontos);
		        						System.out.println("Salário Líquido: " + salarioLiquido);
		  leitura.close();
		    }
	}
