package sistema_academico;
public class Notas {
    private Matricula matricula;
    private double valor;

    public Notas(Matricula matricula, double valor) {
        this.matricula = matricula;
        setValor(valor);
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0 && valor <= 10) {
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Notas [matricula=");
        builder.append(matricula);
        builder.append(", valor=");
        builder.append(valor);
        builder.append("]");
        return builder.toString();
    }
}
