package lista_estruturas_de_repetição;
import java.util.Scanner;
public class atv32 {
	public static void main(String[] args) {
		int i, cont = 0, cod,codMaior = 0,codMenor = 0, numV = 0, numA = 0;
		double maior = Double.MIN_VALUE ,menor = Double.MAX_VALUE, medV = 0, medA = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= 5; i++) {
			System.out.println("digite o codigo da cidade: " + i);
			cod = sc.nextInt();
			System.out.println("número de veiculos de passeio(em 1999)");
			numV = sc.nextInt();
			System.out.println("número de acidentes de transito com vitimas(em 1999): ");
			numA = sc.nextInt();
			if (numA > maior) {
				maior = numA;
				codMaior = cod;
			}
			if(numA < menor) {
				menor = numA;
				codMenor = cod;
			}
			medV = medV + numV;
			if(numV < 2000) {
			medA = medA + numA;	
			cont++;
			}
			sc.close();
		}
		System.out.println("o maior indice de acidentes é da cidade " + codMaior + " com " + maior + " acidentes em 1999.");
		System.out.println("o menor indice de acidentes é da cidade " + codMenor + " com " + menor + " acidentes em 1999.");
		System.out.println("a media de veiculos nas 5 cidades juntas é " + (medV/5));
		if (cont > 0) {
			System.out.println("a media de acidentes de transito nas cidades com menos de 2000 veiculos é " + (medA/cont));
		}else {
			System.out.println("não tem cidade com menos de 2000 veiculos.");
		}
	}
}
