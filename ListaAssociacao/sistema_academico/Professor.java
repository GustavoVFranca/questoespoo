package sistema_academico;
public class Professor {
    private String nome;

    public Professor(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Professor [nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }
}
