package lista_intro_POO;
public class televisor_classe {
    private int canal;
    private int volume;

    public televisor_classe() {
        this.canal = 1;   
        this.volume = 10; 
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
        } else {
            System.out.println("Canal inválido! (válido: 1 a 100)");
        }
    }

    public void aumentarVolume() {
        if (volume < 50) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
