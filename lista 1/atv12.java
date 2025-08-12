package projects;
import java.util.Scanner;
public class atv12 {

	public static void main(String[] args) {
	 Scanner leitura = new Scanner(System.in);
	 	float altura;
	 	String genero;
	 		System.out.println("digite se você é homem ou mulher: ");
	 			genero = leitura.nextLine(); 
	 		System.out.println("digite sua altura: ");
	 		    altura = leitura.nextFloat();
	 		    if (genero.equalsIgnoreCase("homem")) {
	 		    	System.out.println("seu peso ideal é: " + ((72.7*altura) - 58));
	 		    }
	 		    else if(genero.equalsIgnoreCase("mulher")) {
	 		    	System.out.println("seu peso ideal é: " + ((62.1*altura) - 44.7));
	 		    }
	 		    else {
	 		    	System.out.println("não foi possivel definir seu genêro.");
	 		    }
	 		   leitura.close();
}		    
	 		    
	 		    
	 		    
	}		

