package lista_intro_POO;
import java.util.Scanner;

public class atv6_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();

        quadrado q = new quadrado(lado);

        System.out.println("Valor do lado: " + q.getLado());
        System.out.println("Área do quadrado: " + q.calcularArea());

        System.out.print("Digite um novo valor para o lado: ");
        double novoLado = sc.nextDouble();
        q.setLado(novoLado);

        System.out.println("Novo valor do lado: " + q.getLado());
        System.out.println("Nova área do quadrado: " + q.calcularArea());

        sc.close();
    }
}
