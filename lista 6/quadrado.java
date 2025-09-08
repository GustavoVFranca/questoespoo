package lista_intro_POO;
public class quadrado {
    private double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
