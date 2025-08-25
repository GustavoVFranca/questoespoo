package lista_vetor_e_matriz;
import java.util.Scanner;
public class atv10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] data = new int [3];
	System.out.println("digite uma data no padrão dd/mm/aaaa");
	String entrada = sc.nextLine();
	String [] partes = entrada.split("/");
	if(partes.length == 3) {
		data[0] =  Integer.parseInt(partes[0]);
		data[1] = Integer.parseInt(partes[1]);
		data[2] = Integer.parseInt(partes[2]);
		boolean verificador = true;
		if(data[0] < 1 || data[0] > 31) {
		verificador = false;
		}
		if(data[1] < 1 || data[1] > 12) {
		verificador = false;
		}
		if(verificador) {
		System.out.println("data valida.");
		System.out.println("[" + data[0] + ", " + data[1] + ", " + data[2] + "]");
		}else
		System.out.println("data invalida.");
	}else {
		System.out.println("erro: formato da data invalido.");
	}
	sc.close();
	}
}
	