package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv14 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite ate que numero deseja ver soma da sequencia: ");
		int num = sc.nextInt();
		double n = 1, m = 1, s = 0; 
			for (int i = 0; i < num; i++) {
				s = s + n/m;
				n = n + 1;
				m = m + 2;	 
			}	
			System.out.println("S =  "+ s);
			
	sc.close();	
	}
}