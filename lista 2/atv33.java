package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv33 {
	public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    char [] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
    char [] respostas = new char [10];
    int nota;
    nota = 0;

     	for (int i=0; i < 10; i++) {
     		System.out.println("digite sua " + (i+1) + " resposta: ");
     		respostas[i] = leitura.next().charAt(0);
     	}
     	 for (int i = 0; i < 10; i++) {
             if (respostas[i] == gabarito[i]) {
                 nota++;
             }
         }
     	System.out.println("Pontuação final: " + nota);
     	leitura.close();
	}
}