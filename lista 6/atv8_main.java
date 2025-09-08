package lista_intro_POO;
import java.util.Scanner;

public class atv8_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        contaBanco conta = new contaBanco(numero, nome, saldoInicial);

        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getNome());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        conta.depositar(200);
        conta.sacar(100);
        conta.alterarNome("Novo Titular");

        System.out.println("\n--- Após operações ---");
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getNome());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        sc.close();
    }
}
