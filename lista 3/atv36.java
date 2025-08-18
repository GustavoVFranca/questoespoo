package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto,quant ; 
		int cont1 = 0, cont2 = 0, cont3 = 0,cont4 = 0,cont5 = 0 ,cont6 = 0;
		System.out.println("candidatos: \n 1 - candidato 1 \n 2 - candidato 2 \n 3 - candidato 3 \n 4 - candidato 4 \n 5 - voto nulo \n 6 - voto em branco \n 0 - encerrar votação");
		while(true) {
			System.out.println(" Digite seu voto: ");
			voto = sc.nextInt();
			switch (voto) {
			case 0: 
				quant = cont1 + cont2 + cont3 + cont4 + cont5+ cont6;
				System.out.println(" Votos: \n canditado 1 : " + cont1 + "\n candidato 2 : " + cont2 + "\n candidato 3 : " + cont3 + "\n candidato 4 : " + cont4);
				if (quant > 0) {
					System.out.println(" % de votos nulos: " + ((cont5*100)/quant) + "\n % de votos em branco: " + ((cont6*100)/quant));
				}else {
					System.out.println(" % de votos nulos: 0% \n % de votos em branco: 0%");
				}
				sc.close();
				return;
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3: 
				cont3++;
				break;
			case 4:
				cont4++;
				break;
			case 5:
				cont5++;
				break;
			case 6:
				cont6++; 
				break;
			default:
				System.out.println("erro: nenhuma opção selecionada.");
			}			
		}				
	}
}


