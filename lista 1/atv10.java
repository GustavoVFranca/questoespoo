package projects;
import java.util.Scanner;
public class atv10 {

	public static void main(String[] args) {
	 Scanner leitura = new Scanner(System.in);
	 int n1,n2;
	 float n3;
		 System.out.print("digite o primeiro número inteiro: ");
		 	n1 = leitura.nextInt();
		 System.out.print("digite o segundo número inteiro: ");
		 	n2 = leitura.nextInt();
		 System.out.print("digite o número real: ");
		 	n3 = leitura.nextFloat();
		 		System.out.println("o produto do dobro do primeiro com metade do segundo é: " + (2*n1)*(n2/2));
		 		System.out.println("a soma do triplo do primeiro com o terceiro é: " + (3*n1+n3));
		 		System.out.println("o terceiro elevado ao cubo é: " + n3*n3*n3);
		 		leitura.close();
	}

}
