package lista_intro_POO;

public class pagamento_classe {
    private double valorHora;
    private double horasTrabalhadas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double getIR() {
        return getSalarioBruto() * 0.11;
    }

    public double getINSS() {
        return getSalarioBruto() * 0.08;
    }

    public double getSindicato() {
        return getSalarioBruto() * 0.05;
    }

    public double getTotalDescontos() {
        return getIR() + getINSS() + getSindicato();
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getTotalDescontos();
    }
}
