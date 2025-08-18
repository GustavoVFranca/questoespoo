package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        String numero = sc.next();
        String invertido = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            invertido = invertido + numero.charAt(i);
        }
        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}