package lista_vetor_e_matriz;
import java.util.Scanner;
import java.util.Random;
public class atv8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int tam;	
		String senha = "";
		char [] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();				
		
		do {
		System.out.println("qual o tamanho da senha? ");
		tam = sc.nextInt();
		if(tam <= 0 || tam > 26) { 
			System.out.println("erro: o tamanho precisa ser maior que 0 e menor que 26, tente novamente.");
		}
		}while (tam <= 0 || tam > 26);
		for(int i = 1; i <= tam; i++) {
			char sup;
			if(i % 2 == 0){	
				do {
				sup = alfabeto[rand.nextInt(alfabeto.length)];
				}while(sup != 'a' && sup != 'e' && sup != 'i' && sup != 'o' && sup != 'u');												
			}else {
				do {
				sup = alfabeto[rand.nextInt(alfabeto.length)];	
				}while(sup == 'a' || sup =='e' || sup == 'i' || sup == 'o' || sup == 'u');	
			}
			senha += sup;
		}
		System.out.println(senha);						
		sc.close();
	}

}
