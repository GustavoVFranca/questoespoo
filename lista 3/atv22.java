package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv22 {
	public static void main(String[] args) {
		int voto = 0,cand1 = 0, cand2 = 0, cand3 = 0, nulo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero total de votantes: ");
		int votantes = sc.nextInt();
			for (int i = 1; i <= votantes; i++) {
				do { 
				System.out.println("escolha qual candidato deseja votar: \n1 - candidato 1. \n2 - candidato 2. \n3 - candidato 3. \n4 - nulo. ");
				voto = sc.nextInt();
				if (voto != 1 && voto != 2 &&  voto != 3 && voto != 4) {
					System.out.println("ERRO: o voto precisa ser um número valido.");
				}
					if (voto == 1) {
						cand1++;
					}else if (voto == 2) {
						cand2++;
					}else if (voto == 3) {
						cand3++;
					}else if (voto == 4) {
						nulo++;
					}
				}while (voto != 1 && voto != 2 && voto != 3 && voto != 4);
			}
		System.out.println("o candidato 1 teve " + cand1 + " votos.");
		System.out.println("o candidato 2 teve " + cand2 + " votos.");
		System.out.println("o candidato 3 teve " + cand3 + " votos.");
		System.out.println("teve " + nulo + " votos nulos.");
		
		sc.close();
	}

}
