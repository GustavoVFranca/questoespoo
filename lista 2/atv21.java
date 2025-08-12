package lista_estruturas_de_seleção;
import java.util.Scanner;
public class atv21 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String data;
        int dia, mes, ano;
        boolean bissexto, dataValida;
        		System.out.print("Digite a data no formato dd/mm/aaaa: ");
        			data = leitura.next();
        		String[] partes = data.split("/");
        			dia = Integer.parseInt(partes[0]);
        			mes = Integer.parseInt(partes[1]);
        			ano = Integer.parseInt(partes[2]);
        			bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
        				int[] diasMes = {31, (bissexto ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        					dataValida = mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes[mes - 1];
        						if (dataValida) {
        							System.out.println("Data válida.");
        						} else {
        							System.out.println("Data inválida.");
        						}
        leitura.close();
    }
}
