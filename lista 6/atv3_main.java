package lista_intro_POO;

import java.util.Scanner;

public class atv3_main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        calculos_classe calc = new calculos_classe();

        System.out.print("Digite o primeiro número: ");
        calc.setNumero1(leitura.nextDouble());

        System.out.print("Digite o segundo número: ");
        calc.setNumero2(leitura.nextDouble());

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());

        leitura.close();
    }
}
