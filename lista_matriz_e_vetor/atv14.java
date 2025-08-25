package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM = 2;
        int[] idades = new int[TAM];
        double[] alturas = new double[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite a idade do aluno " + (i+1) + ": ");
            idades[i] = sc.nextInt();

            System.out.print("Digite a altura do aluno " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
        }
        double somaAlturas = 0;
        int Mais13 = 0;
        for (int i = 0; i < TAM; i++) {
            if (idades[i] > 13) {
                somaAlturas += alturas[i];
                Mais13++;
            }
        }
        double mediaAlturas = somaAlturas / Mais13;
        int abaixoMedia = 0;
        for (int i = 0; i < TAM; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAlturas) {
                abaixoMedia++;
            }
        }
        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + abaixoMedia);
        sc.close();
    }
}
