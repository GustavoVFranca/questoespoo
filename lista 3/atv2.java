package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String usuario, senha;
		do{ 
		System.out.println("digite um nome de usuario: ");
		usuario = sc.nextLine();
		System.out.println("digite uma senha diferente do nome de usuario: ");
		senha = sc.nextLine();
		if (usuario.equals (senha)){
			System.out.println("erro: a senha deve ser diferente do usuario.");
		}
	}while (usuario.equals(senha));
		sc.close();
  }
}