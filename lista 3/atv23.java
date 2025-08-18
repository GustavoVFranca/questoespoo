package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double med = 0,alunos = 0;
		System.out.println("digite a quantidade de turmas: ");
		int turmas = sc.nextInt();
		int[] turma = new int [turmas];
		for(int i = 0; i < turmas; i++) {
			do {
				System.out.println("digite a quantidade de alunos da turma " + (i+1) + ":");
				turma[i] = sc.nextInt();
				if(turma[i] < 40 && turma[i] > 0) {
					alunos = alunos + turma[i];
				}else if(turma[i] > 40) {
					System.out.println("erro: as turmas não podem ter mais que 40 alunos.");
				}else if (turma[i] <= 0) {
					System.out.println("erro: a turma deve ter mais que 0 alunos.");
				}
			}while(turma[i] > 40 || turma[i] <= 0);
		}
		med = alunos/turmas;
		System.out.println("a media de aluno das " + turmas + " turmas é: " + med);	
		sc.close();
	}

}
