package lista_vetor_e_matriz;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class atv19 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o total de participantes: ");
		int tam = sc.nextInt();
		double [] medias = new double [tam];
		double[][] saltos = new double [tam][5];
		double campeao = 0 , ultimo = 0;
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("digite o " + (j+1) + " salto do " + (i+1) + " participante:");
				saltos[i][j] = sc.nextDouble();
				medias[i] += saltos[i][j];
				
				}
				if(i == 0) { 
					campeao = medias[i];
					ultimo = medias[i];
				}
				if(medias[i] > campeao){
					campeao = medias[i];
				}
				if(medias[i] < ultimo) {
					ultimo = medias[i];
				}
		}
		for (int i = 0; i < tam; i++) {
			medias[i] = medias[i]/5;
		}
		ultimo = ultimo/5;
		campeao = campeao/5;
		System.out.printf("           ");
		for(int j = 0; j < 5; j++) {
			System.out.printf("salto " + (j+1) + "    ");
		}
		System.out.println();
		for(int i = 0; i < tam; i++) {
		    System.out.print("atleta " + (i+1) + "  ");
		    for(int j = 0; j < 5; j++) {
		        System.out.print(saltos[i][j]+ "          ");
		    }
		    System.out.println("media : " + medias[i]);
		    System.out.println();
		}
		System.out.println("media de salto do campeão: " + campeao);
		System.out.println("media de salto do ultimo lugar: " + ultimo);
		FileWriter arq = new FileWriter("D:\\\\resultado4.txt");
        PrintWriter gravar = new PrintWriter(arq);
		gravar.printf("           ");
		for(int j = 0; j < 5; j++) {
			gravar.printf("salto " + (j+1) + "    ");
		}
		gravar.println();
		for(int i = 0; i < tam; i++) {
			gravar.print("atleta " + (i+1) + "  ");
		    for(int j = 0; j < 5; j++) {
		    	gravar.print(saltos[i][j]+ "          ");
		    }
		    gravar.println("media : " + medias[i]);
		    gravar.println();
		}
		gravar.println("media de salto do campeão: " + campeao);
		gravar.println("media de salto do ultimo lugar: " + ultimo);
		arq.close();
		sc.close();
	}
}
