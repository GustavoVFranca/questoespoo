package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("mostrar a tabuada de: ");
		int tab = sc. nextInt();
		System.out.println("começar por: ");
		int com = sc.nextInt();
		System.out.println("terminar em: ");
		int fim = sc.nextInt();
			if(com > fim) {
				int troca = fim;
				fim = com;
				com = troca;
				System.out.println("você digitou na ordem errada mas ja foi corrigido.");
			}
			System.out.println("vou montar a tabuada de " + tab + " começando em " + com + " e terminando em " + fim + ":");	
			for(int i = com; i <= fim; i++) {
				System.out.println(tab + " X " + i + " = " + (tab*i));
			}									
		sc.close();
	}

}
