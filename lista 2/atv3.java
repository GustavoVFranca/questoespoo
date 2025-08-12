package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String genero;
		System.out.println("M ou F?: ");
			genero = leitura.nextLine(); 
		    if (genero.equalsIgnoreCase("M")) {
		    	System.out.println("genero: masculino.");
		    }else if (genero.equalsIgnoreCase("F")){
		    	System.out.println("genero: feminino.");
		    }else 
		    	System.out.println("a letra selecionada não é valida.");
		    leitura.close(); 
		    }
	}


