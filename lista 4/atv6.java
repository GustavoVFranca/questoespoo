package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM = 10;  
        final int NOTAS = 4; 

        double[] medias = new double[TAM];
        int cont = 0;

        for (int i = 0; i < TAM; i++) {
            double soma = 0; 
            for (int j = 0; j < NOTAS; j++) {
                System.out.print("Digite a " + (j+1) + " nota do aluno " + (i+1) + ": ");
                soma += sc.nextDouble();
            }
            medias[i] = soma / NOTAS; 
            if (medias[i] >= 7.0) {
                cont++;
            }
        }
        
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Aluno " + (i+1) + " média: " + medias[i]);
        }
        System.out.println("\nNúmero de alunos aprovados:  " + cont);
        sc.close();
    }
}
