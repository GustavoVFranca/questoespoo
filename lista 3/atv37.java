package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv37 {
	public static void main(String[] args) {
		char [] gabarito = new char [10];
		char [] respostas = new char [10];
		int verificacao, pontuacao;
		int med = 0, cont = 0, maior = Integer.MIN_VALUE, menor = (int) Integer.MAX_VALUE;;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("digite a resposta do gabarito questão " + (i+1) + ":");
			gabarito[i] = sc.next().charAt(0);
		}
		while (true) {
			pontuacao = 0;
			for (int j = 0; j < 10; j++) {
				System.out.println("digite a resposta da questão " + (j+1) + ":");
				respostas[j] = sc.next().charAt(0);
				if(respostas[j] == gabarito[j]) {
					pontuacao++;
				}
			}
				if(pontuacao > maior) {
					maior = pontuacao;
				}
				if(pontuacao < menor) {
					menor = pontuacao;
				}
				med = med + pontuacao;
				cont++;	
				System.out.println("se mais ninguem for usar digite 0.");
				verificacao = sc.nextInt();
				if(verificacao == 0 ) {
					break;
				}												
		}
		sc.close();
		System.out.println("Maior nota: " + maior);
		System.out.println("Menor nota: " + menor);
		System.out.println("Total de alunos: " + cont);
		System.out.println("Média da turma: " + (med / cont));
	}

}
