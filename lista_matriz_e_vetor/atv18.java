package lista_vetor_e_matriz;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int N = sc.nextInt();
        sc.nextLine(); 
        String[][] alunos = new String[N][3];
        double[] medias = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            alunos[i][0] = sc.nextLine();

            System.out.print("Nota 1: ");
            alunos[i][1] = String.valueOf(sc.nextDouble());

            System.out.print("Nota 2: ");
            alunos[i][2] = String.valueOf(sc.nextDouble());
            sc.nextLine();
            double n1 = Double.parseDouble(alunos[i][1]);
            double n2 = Double.parseDouble(alunos[i][2]);
            medias[i] = (n1 + n2) / 2.0;
        }
        double maiorNota = -1, menorNota = 11;
        String alunoMaiorNota = "", alunoMenorNota = "";
        double maiorMedia = -1, menorMedia = 11;
        String alunoMaiorMedia = "", alunoMenorMedia = "";
        double somaTurma = 0;
        for (int i = 0; i < N; i++) {
            String nome = alunos[i][0];
            double n1 = Double.parseDouble(alunos[i][1]);
            double n2 = Double.parseDouble(alunos[i][2]);
            System.out.println(nome + " Nota1: " + n1 + ", Nota2: " + n2 + ", Média: " + medias[i]);
            somaTurma += medias[i];        
            if (n1 > maiorNota) { maiorNota = n1; alunoMaiorNota = nome; }
            if (n2 > maiorNota) { maiorNota = n2; alunoMaiorNota = nome; }
            if (n1 < menorNota) { menorNota = n1; alunoMenorNota = nome; }
            if (n2 < menorNota) { menorNota = n2; alunoMenorNota = nome; }
            if (medias[i] > maiorMedia) { maiorMedia = medias[i]; alunoMaiorMedia = nome; }
            if (medias[i] < menorMedia) { menorMedia = medias[i]; alunoMenorMedia = nome; }
        }
        double mediaGeral = somaTurma / N;   
        System.out.println("Maior Nota: " + maiorNota + " (Aluno: " + alunoMaiorNota + ")");
        System.out.println("Menor Nota: " + menorNota + " (Aluno: " + alunoMenorNota + ")");
        System.out.println("Maior Média: " + maiorMedia + " (Aluno: " + alunoMaiorMedia + ")");
        System.out.println("Menor Média: " + menorMedia + " (Aluno: " + alunoMenorMedia + ")");
        System.out.println("Média Geral da Turma: " + mediaGeral);
        System.out.println("Alunos acima da Média Geral");
        for (int i = 0; i < N; i++) {
            if (medias[i] >= mediaGeral) {
                System.out.println(alunos[i][0] + " Média: " + medias[i]);
            }
        }
        System.out.println("Alunos abaixo da Média Geral ");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
                System.out.println(alunos[i][0] + " Média: " + medias[i]);
            }
        }
        FileWriter arq = new FileWriter("D:\\\\resultado3.txt");
        PrintWriter gravar = new PrintWriter(arq);
        gravar.println("Maior Nota: " + maiorNota + " (Aluno: " + alunoMaiorNota + ")");
        gravar.println("Menor Nota: " + menorNota + " (Aluno: " + alunoMenorNota + ")");
        gravar.println("Maior Média: " + maiorMedia + " (Aluno: " + alunoMaiorMedia + ")");
        gravar.println("Menor Média: " + menorMedia + " (Aluno: " + alunoMenorMedia + ")");
        gravar.println("Média Geral da Turma: " + mediaGeral);
        gravar.println("Alunos acima da Média Geral");
        for (int i = 0; i < N; i++) {
            if (medias[i] >= mediaGeral) {
            	gravar.println(alunos[i][0] + " Média: " + medias[i]);
            }
        }
        gravar.println("Alunos abaixo da Média Geral ");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
            	gravar.println(alunos[i][0] + " Média: " + medias[i]);
            }
        }
        sc.close();
        gravar.close();
    }
}
