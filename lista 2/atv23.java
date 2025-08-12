package lista_estruturas_de_seleção;
import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int idade1, idade2, idade3;
        double media;
        	System.out.println("Digite a idade do primeiro aluno:");
        		idade1 = leitura.nextInt();
        	System.out.println("Digite a idade do segundo aluno:");
        		idade2 = leitura.nextInt();
        	System.out.println("Digite a idade do terceiro aluno:");
        		idade3 = leitura.nextInt();
        		media = (idade1 + idade2 + idade3) / 3;
        			if (media < 25) {
        				System.out.println("Turma Jovem");
        			} else if (media <= 40) {
        				System.out.println("Turma Adulta");
        			} else {
        				System.out.println("Turma Idosa");
        			}        
        leitura.close();
    }
}
