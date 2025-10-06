package sistema_academico;
public class Fase {
    private int numero;
    private Disciplina disciplina;

    public Fase(int numero, Disciplina disciplina) {
        setNumero(numero);
        this.disciplina = disciplina;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fase [numero=");
        builder.append(numero);
        builder.append(", disciplina=");
        builder.append(disciplina);
        builder.append("]");
        return builder.toString();
    }
}
