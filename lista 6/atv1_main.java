package lista_intro_POO;

import java.util.Scanner;

public class atv1_main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        nome_sobrenome pessoa = new nome_sobrenome();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(leitura.nextLine());

        System.out.print("Digite seu sobrenome: ");
        pessoa.setSobrenome(leitura.nextLine());

        System.out.println("Nome completo: " + pessoa.getNomeCompleto());

        leitura.close();
    }
}
