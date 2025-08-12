package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv9 {

	public static void main(String[] args) {
	 Scanner leitura = new Scanner(System.in);
	 	double altura,peso,pesoI;
	 	String genero;
	 		System.out.println("digite se você é homem ou mulher: ");
	 			genero = leitura.nextLine(); 
	 		System.out.println("digite sua altura: ");
	 		    altura = leitura.nextDouble();
	 		System.out.println("digite seu peso: ");    
	 			peso = leitura.nextDouble();
	 			 	System.out.println("sexo: " + genero);
		 		    System.out.println("sua altura é: " + altura);
		 		    System.out.println("você pesa: " + peso);
	 		    if (genero.equalsIgnoreCase("homem")) {
	 		    pesoI = 72.7*altura - 58;
	 		      System.out.println("peso ideal: " +pesoI);
	 		      if (peso == pesoI) {
	 		    	System.out.println("você esta no peso ideal.");
	 		      } else if (peso < pesoI) {
	 		    	  System.out.println("você esta abaixo do peso ideal");
	 		      		}else {
	 		      			System.out.println("você esta acima do peso ideal");
	 		       }	 		      
	 		    }
	 		    else if(genero.equalsIgnoreCase("mulher")) {
	 		    pesoI = 62.1*altura - 44.7;
	 		   System.out.println("peso ideal: " +pesoI);
	 		      if (peso == pesoI) {
	 		    	System.out.println("você esta no peso ideal.");
	 		      } else if (peso < pesoI) {
	 		    	  System.out.println("você esta abaixo do peso ideal");
	 		      		}else {
	 		      			System.out.println("você esta acima do peso ideal");
	 		      		}
	 		    }
	 		    	else {
	 		    	System.out.println("não foi possivel definir seu genêro.");
	 		    	}	
	 		   leitura.close();
	}		   	 		    
}		

