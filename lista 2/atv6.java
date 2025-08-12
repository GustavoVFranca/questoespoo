package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv6 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int num;
		System.out.println("digite um numero inteiro: ");
		num = leitura.nextInt();
			if (num % 2 == 0) {
				num ++;
				System.out.println("o número par transformado em impar é: "+ num);
			}else{
				num --;
				System.out.println("o número impar transformado em par é: "+ num);
			}
			leitura.close();
	}

}
