package lista_intro_POO;

public class intervalo_classe {
    private int inicio;
    private int fim;

    
    public intervalo_classe(int inicio, int fim) {
        if (inicio > fim) {
            System.out.println("Os valores foram informados em ordem inversa. Vou inverter.");
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    public void mostrarIntervalo() {
        System.out.println("Números no intervalo:");
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
