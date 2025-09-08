package lista_intro_POO;
import java.util.Scanner;

public class atv10_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        televisor_classe tv = new televisor_classe();
        int opcao;

        do {
            System.out.println("\n=== Controle Remoto ===");
            System.out.println("1 - Mudar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Mostrar status da TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o novo canal (1 a 100): ");
                    int canal = sc.nextInt();
                    tv.mudarCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    System.out.printf("Canal atual: %d | Volume atual: %d%n", 
                                      tv.getCanal(), tv.getVolume());
                    break;
                case 0:
                    System.out.println("Desligando a TV...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
