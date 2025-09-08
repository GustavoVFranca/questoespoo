package lista_intro_POO;

import java.util.Scanner;

public class atv2_main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = leitura.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = leitura.nextInt();

        
        intervalo_classe intervalo = new intervalo_classe(n1, n2);
     
        intervalo.mostrarIntervalo();

        leitura.close();
    }
}
