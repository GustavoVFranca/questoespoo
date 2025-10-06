package sistema_academico;
public class Aluno {
    private String nome;
    private Curso curso;

    public Aluno(String nome, Curso curso) {
        setNome(nome);
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Aluno [nome=");
        builder.append(nome);
        builder.append(", curso=");
        builder.append(curso);
        builder.append("]");
        return builder.toString();
    }
}
