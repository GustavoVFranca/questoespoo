package lista_estruturas_de_seleção;
import java.util.Scanner; 

public class  atv2{

	public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	int n1;
	System.out.println("digite 2 numeros: ");
	n1 = leitura.nextInt();
	
		if (n1 > 0){ 
			System.out.println("o número é positivo.");
		}else if (n1 < 0) 
			System.out.println("o número é negativo.");
				else {
					System.out.println("o número é zero.");
				}
		leitura.close();
		} 
    }

