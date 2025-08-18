package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
		double med = 0, soma = 0;
		int i = 0;
		System.out.println("digite as temperaturas(-999 para parar a leitura): ");
		while(true) {
			temp = sc.nextDouble();
			if(temp == -999) {
				break;
			}
			soma = soma + temp;
			i++;
			if(temp > maior) {
				maior = temp;
			}
			if(temp < menor){
				menor = temp;
			}
		}
		if(i > 0) {
			med = soma/i;	
		System.out.println("maior temperatura: " + maior);
		System.out.println("menor temperatura: " + menor);
		System.out.println("media das temperaturas: " + med);
		}else {
			System.out.println("nenhuma temperatura informada.");
		}
		sc.close();
	}

}
