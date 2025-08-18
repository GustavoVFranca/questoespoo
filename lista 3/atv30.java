package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alto = Double.MIN_VALUE, baixo = Double.MAX_VALUE, magro = Double.MAX_VALUE, gordo = Double.MIN_VALUE;	
		int cod, codA = 0, codG = 0, codB = 0, codM = 0, i = 0;
		double altura, peso, somaA = 0, somaP = 0;
		while(true) {
			System.out.println("digite o codigo de cliente(digite 0 para encerrar): ");
			cod = sc.nextInt();
			if (cod == 0) {
				break;
			}
			System.out.println("digite a altura do cliente: ");
			altura = sc.nextDouble();
			System.out.println("digite o peso do cliente: ");
			peso = sc.nextDouble();
			if (altura > alto) {
				alto = altura;
				codA = cod;
			}
			if (altura < baixo) {
				baixo = altura;
				codB = cod;
			}
			if (peso > gordo) {
				gordo = peso;
				codG = cod;		
			}
			if (peso < magro) {
				magro = peso ;
				codM = cod;
			}	
			somaA = somaA + altura;
			somaP = somaP + peso;
			i++;
		}	
		if (i > 0) {
			System.out.println("cliente mais alto: codigo " + codA + " altura " + alto);
			System.out.println("cliente mais baixo: codigo " + codB + " altura " + baixo);
			System.out.println("cliente mais pesado: codigo " + codG + " altura " + gordo);
			System.out.println("cliente mais magro: codigo " + codM + " altura " + magro);
			System.out.println("media das alturas: " + (somaA / i));
			System.out.println("media dos pesos: " + (somaP / i));
		}else {
			System.out.println("nenhum registro.");
		}
		sc.close();
	}
}
