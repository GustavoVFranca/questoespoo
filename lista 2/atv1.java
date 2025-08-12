package lista_estruturas_de_seleção;
import java.util.Scanner; 

public class atv1 {

	public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	int n1,n2;
	System.out.println("digite 2 numeros: ");
	n1 = leitura.nextInt();
	n2 = leitura.nextInt();
		if (n1 > n2){ 
			System.out.println("o maior número é: "+ n1+ ".");
		}else if (n2 > n1) 
			System.out.println("o maior número é: " + n2+ ".");
				else {
					System.out.println("o números são iguais.");
				}
		leitura.close();
		} 
    }

