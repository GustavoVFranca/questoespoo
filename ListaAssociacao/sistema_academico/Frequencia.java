package sistema_academico;
public class Frequencia {
    private Matricula matricula;
    private int presencas;

    public Frequencia(Matricula matricula, int presencas) {
        this.matricula = matricula;
        setPresencas(presencas);
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        if (presencas >= 0) {
            this.presencas = presencas;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Frequencia [matricula=");
        builder.append(matricula);
        builder.append(", presencas=");
        builder.append(presencas);
        builder.append("]");
        return builder.toString();
    }
}
