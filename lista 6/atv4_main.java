package lista_intro_POO;

import java.util.Scanner;

public class atv4_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pagamento_classe folha = new pagamento_classe();

        System.out.print("Digite quanto você ganha por hora: ");
        folha.setValorHora(sc.nextDouble());

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        folha.setHorasTrabalhadas(sc.nextDouble());

        System.out.println("Salário Bruto : R$ " + folha.getSalarioBruto());
        System.out.println("IR (11%)      : R$ " + folha.getIR());
        System.out.println("INSS (8%)     : R$ " + folha.getINSS());
        System.out.println("Sindicato (5%): R$ " + folha.getSindicato());
        System.out.println("Total descontos: R$ " + folha.getTotalDescontos());
        System.out.println("Salário Líquido: R$ " + folha.getSalarioLiquido());

        sc.close();
    }
}
