package lista_intro_POO;

import java.util.Scanner;

public class atv7_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa_classe pessoa = new Pessoa_classe();

        System.out.print("Digite o nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("Digite a idade: ");
        pessoa.setIdade(sc.nextInt());

        System.out.print("Digite o peso (kg): ");
        pessoa.setPeso(sc.nextDouble());

        System.out.print("Digite a altura (cm): ");
        pessoa.setAltura(sc.nextDouble());

       
        pessoa.envelhecer();    
        pessoa.engordar(1);      
        pessoa.emagrecer(1);     

        System.out.println("Dados da Pessoa");
        System.out.println("Nome   : " + pessoa.getNome());
        System.out.println("Idade  : " + pessoa.getIdade());
        System.out.println("Peso   : " + pessoa.getPeso() + " kg");
        System.out.println("Altura : " + pessoa.getAltura() + " cm");

        sc.close();
    }
}
