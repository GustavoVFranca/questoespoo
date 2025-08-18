package lista_estruturas_de_repetição;
import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = sc.nextInt();
        int totalDivisoes = 0; 
        System.out.println("Números primos entre 1 e " + N + ":");
        for (int num = 2; num <= N; num++) {
            boolean primo = true;
            for (int i = 2; i < num; i++) {
                totalDivisoes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }
        System.out.println("Total de divisões executadas: " + totalDivisoes);
        sc.close();
    }
}
