package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv11 {

	public static void main(String[] args) {
		String escolha;
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite: M - matutino,  V - vespertino,  N - noturno.");
		escolha = leitura.nextLine();
			if (escolha.equalsIgnoreCase ("M")) {
				System.out.println("bom dia"); 
			}else if (escolha.equalsIgnoreCase ("V")) {
				System.out.println("boa tarde");
			}else if (escolha.equalsIgnoreCase ("N")){
				System.out.println("boa noite");
			}else
		{
				System.out.println("não foi possivel ler sua opção. ");
		}

			leitura.close();
	}

}
