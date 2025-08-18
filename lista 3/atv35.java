package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv35 {
	public static void main(String[] args) {
		int cod, quant;
		String produto;
		double precoI, valorI, total = 0;
		Scanner sc = new Scanner (System.in);
		while(true) {
		System.out.println("digite o codigo do item que deseja(0 encerra o pedido): ");
		cod = sc.nextInt();
		if(cod == 0) {
			break;
		}
		System.out.println("digite a quantidade que deseja: ");
		quant = sc.nextInt();
		switch(cod) {
		
		case 100:
			produto = "cachorro quente";
			precoI = 1.20;
			break;
		case 101:
			produto = "bauru simples";
			precoI = 1.30;
			break;
		case 102:
			produto = "bauru com ovo";
			precoI = 1.50;
			break;
		case 103:
			produto = "hamburguer";
			precoI = 1.20;
			break;
		case 104:
			produto = "cheeseburguer";
			precoI = 1.30;
			break;
		case 105:
			produto = "refrigerante";
			precoI = 1.00;
			break;
		default: 
			System.out.println("codigo invalido.");
			continue;
		}
		valorI = precoI + quant;
		total = total +valorI;
		System.out.println(quant + " " + produto + "  R$" + valorI);
		}
		System.out.println("o valor total do pedido é: R$" + total);
		sc.close();	
	}

}
