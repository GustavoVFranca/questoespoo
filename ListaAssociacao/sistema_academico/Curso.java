package sistema_academico;
public class Curso {
    private String nome;
    private Fase fase;

    public Curso(String nome, Fase fase) {
        setNome(nome);
        this.fase = fase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Curso [nome=");
        builder.append(nome);
        builder.append(", fase=");
        builder.append(fase);
        builder.append("]");
        return builder.toString();
    }
}
