package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alto = Double.MIN_VALUE , baixo = Double.MAX_VALUE, altura;
		int num, numA = 0, numB = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("digite o número do aluno: ");
			num = sc.nextInt();
			System.out.println("digite a altura do aluno: ");
			altura = sc.nextDouble();
			if(altura > alto) {
				alto = altura;
				numA = num;
			}
			if(altura < baixo) {
				baixo = altura;	
				numB = num;			
			}
		}
		System.out.println("o numero do aluno mais alto é " + numA + " e sua altura é " + alto);
		System.out.println("o numero do aluno mais baixo é " + numB + " e sua altura é " + baixo);
		sc.close();
	}

}
