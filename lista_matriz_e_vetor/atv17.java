package lista_vetor_e_matriz;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class atv17 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		final int TAM = 5;
		double [][] produtos = new double [TAM][TAM];
		double [] soma = new double[TAM];
		double [] mediaProdutos = new double[TAM];
		double caro = 0, barato = 0;
		for(int i = 0; i < TAM; i++) {
			for(int j = 0; j < TAM; j++) {
				System.out.println("digite o preço no mercado " + (i+1) + " do produto " + (j+1));
				produtos[i][j] = sc.nextDouble();
				soma[i] += produtos[i][j];
			}
		}
		for(int i = 0; i < TAM; i++) {
			for(int j = 0; j < TAM; j++) {
				mediaProdutos[i] += produtos[j][i];
				if(j == (TAM-1)) {
					mediaProdutos[i] = mediaProdutos[i]/TAM;
				}
			}
		}
		for(int i = 0; i < TAM; i++) {
			if(i == 0) {
				caro = soma[i];
				barato = soma[i];
			}
			if(soma[i] > caro) {
				caro = soma[i];
			}else if(soma[i] < barato) {
				barato = soma[i];
			}
		}
		System.out.printf("           ");
		for(int j = 0; j < TAM; j++) {
			System.out.printf("produto " + (j+1) + "    ");
		}
		System.out.println();
		for(int i = 0; i < TAM; i++) {
		    System.out.print("mercado " + (i+1) + "  ");
		    for(int j = 0; j < TAM; j++) {
		        System.out.print(produtos[i][j]+ "          ");
		    }
		    System.out.println();
		}
		for(int i =0; i < TAM; i++) {
			System.out.println("produto " + (i+1) + " media de preço: " + mediaProdutos[i]);
		}
		for(int i =0; i < TAM; i++) {
			System.out.println("a soma do preço dos produtos por mercado: " + soma[i]);
		}
		System.out.println("valor no mais caro: " + caro);
		System.out.println("valor no mais barato: " + barato);
		FileWriter arq = new FileWriter("D:\\resultado2.txt");
		
		PrintWriter gravar = new PrintWriter(arq);
		gravar.printf("           ");
		for(int j = 0; j < TAM; j++) {
			gravar.printf("produto " + (j+1) + "    ");
		}
		gravar.println();
		for(int i = 0; i < TAM; i++) {
			gravar.print("mercado " + (i+1) + "  ");
		    for(int j = 0; j < TAM; j++) {
		    	gravar.print(produtos[i][j]+ "          ");
		    }
		    gravar.println();
		}
		for(int i =0; i < TAM; i++) {
			gravar.println("produto " + (i+1) + " media de preço: " + mediaProdutos[i]);
		}
		for(int i =0; i < TAM; i++) {
			gravar.println("a soma do preço dos produtos por mercado: " + soma[i]);
		}
		gravar.println("valor no mais caro: " + caro);
		gravar.println("valor no mais barato: " + barato);
		sc.close();
		gravar.close();
	}

}
