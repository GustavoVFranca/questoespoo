package lista_intro_POO;
import java.util.Scanner;

public class atv5_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalGeral = 0;
        int codigo, quantidade;

        System.out.println("CARDAPIO: ");
        System.out.println("100 - Cachorro Quente   R$ 1,20");
        System.out.println("101 - Bauru Simples     R$ 1,30");
        System.out.println("102 - Bauru com ovo     R$ 1,50");
        System.out.println("103 - Hamburguer        R$ 1,20");
        System.out.println("104 - Cheeseburguer     R$ 1,30");
        System.out.println("105 - Refrigerante      R$ 1,00");
        

        do {
            System.out.print("Digite o código do produto (0 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo == 0) break;

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            pedidos_classe pedido = new pedidos_classe(codigo, quantidade);

            double totalItem = pedido.calcularTotal();
            System.out.printf("%d x %s (R$ %.2f cada) = R$ %.2f%n",
                              pedido.getQuantidade(), pedido.getNome(),
                              pedido.getPreco(), totalItem);

            totalGeral += totalItem;
        } while (codigo != 0);

        System.out.printf("Total geral do pedido: R$ %.2f%n", totalGeral);
        sc.close();
    }
}
