package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv21 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int idade = 0;
	    System.out.println("digite quantas pessoas são: ");
	    int pessoas = sc.nextInt();
	     for (int i = 1; i <= pessoas; i++) { 
	    	 System.out.println("digite a idade da pessoa "+ i + ":");
	    	 idade = idade + sc.nextInt(); 	 
	     }
	     double med = idade / pessoas; 
	     if (med > 0 && med <= 25.26) {
	    	 System.out.println("turma jovem.");
	     } else if (med > 25.26 && med <= 60) {
	    	 System.out.println("turma adulta.");
	     }else if (med > 60) {
	    	 System.out.println("turma idosa.");
	     }
	     sc.close();
	}

}
