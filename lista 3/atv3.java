package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			String nome;
			int idade;
			double salario;
			char sexo, estadoCivil;
			do {
				System.out.println("digite seu nome (mais que 3 letras): ");
				nome = sc.nextLine();
				if (nome.length() <= 3) { 
					System.out.println("erro: seu nome precisa ter mais que 3 letras.");
				}
			}while (nome.length() <= 3);
			do {
				System.out.println("digite sua idade: ");
				idade  = sc.nextInt();
				if (idade < 0 || idade > 150) { 
					System.out.println("erro: sua idade precisa estar entre 0 e 150 anos.");
				}
			}while (idade < 0|| idade > 150);
			do {
				System.out.println("digite seu salario: ");
				salario = sc.nextDouble();
				if (salario <= 0) { 
					System.out.println("erro: seu salario precisa ser maior que 0.");
				}
			}while (salario <= 0);
			do {
				System.out.println("digite seu sexo (M ou F): ");
				sexo = sc.next().toLowerCase().charAt(0);
				if (sexo != 'f' && sexo != 'm') { 
					System.out.println("erro: seu sexo precisa ser M ou F.");
				}
			}while (sexo != 'f' && sexo != 'm');
			do {
				System.out.println("digite seu estado civil (s , c, v, d)");
				estadoCivil = sc.next().toLowerCase().charAt(0);
				if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') { 
					System.out.println("erro: seu estado civil precisa ser (s , c, v, d)");
				}
			}while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
			sc.close();
	}
}