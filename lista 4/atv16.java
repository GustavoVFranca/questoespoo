package lista_vetor_e_matriz;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class atv16 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tam, soma = 0, contP = 0,contI = 0, maior = 0 , menor = 0;
		int diagonalP = 0, diagonalS = 0;
		do {
		System.out.println("digite um valor inteiro entre 3 e 11:");
		tam = sc.nextInt();
		if(tam < 3 || tam > 11) {
			System.out.println("erro: o valor deve estar entre 3 e 11, tente novamente.");
		}
		}while(tam < 3 || tam > 11);
		int [][] matriz = new int [tam][tam];
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				System.out.println("digite o valor da matriz linha " + (i+1) + " coluna " + (j+1) + ":");
				matriz[i][j] = sc.nextInt();
				soma += matriz[i][j];
				if(i == 0 && j == 0) {
					menor = matriz[i][j];
					maior = matriz[i][j];
				}
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
				}else if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				
				}
				if(matriz[i][j] % 2 == 0) {
					contP++;
				}else {
					contI++;
				}			
			}
		}		
		for(int i = 0; i < tam; i++) {
		diagonalP += matriz[i][i];
		}
		int k = tam - 1;
		for(int i = 0; i < tam; i++) {
			diagonalS += matriz[i][k];
			k--;			
		}
		sc.close();
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("soma dos elementos: " + soma);
		if(contP + contI != 0) {
		System.out.println("media dos elementos: " + soma/(contP+contI));
		}
		System.out.println("maior valor: " + maior);
		System.out.println("menor valor: " + menor);
		System.out.println("contador pares: " + contP);
		System.out.println("contadores impares: " + contI);
		System.out.println("soma da diagonal principal: " + diagonalP);
		System.out.println("soma da diagonal secundaria: " + diagonalS);
		FileWriter arq = new FileWriter("D:\\\\resultado.txt");
		
		PrintWriter gravar = new PrintWriter(arq);
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				gravar.printf(matriz[i][j] + " ");
			}
			gravar.println(" ");
		}
		gravar.println("soma dos elementos: " + soma);
		if(contP + contI != 0) {
			gravar.println("media dos elementos: " + soma/(contP+contI));
		}
		gravar.println("maior valor: " + maior);
		gravar.println("menor valor: " + menor);
		gravar.println("contador pares: " + contP);
		gravar.println("contadores impares: " + contI);
		gravar.println("soma da diagonal principal: " + diagonalP);
		gravar.println("soma da diagonal secundaria: " + diagonalS);
		
		gravar.close();
	}

}
