package CarroMotorPessoa;
public class CarroMain {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gustavo França", "Rua das Palmeiras, 123");
        Motor m = new Motor("Volkswagen", 1.6f, 4, "Gasolina");
        Carro c = new Carro("Volkswagen", "Gol", "Preto", 2022, p, m);

        System.out.println(p);
        System.out.println(m);
        System.out.println(c);
    }
}
