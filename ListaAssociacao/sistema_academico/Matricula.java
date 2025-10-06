package sistema_academico;
public class Matricula {
    private Aluno aluno;
    private String situacao;

    public Matricula(Aluno aluno, String situacao) {
        this.aluno = aluno;
        setSituacao(situacao);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        if (situacao.length() > 0) {
            this.situacao = situacao;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Matricula [aluno=");
        builder.append(aluno);
        builder.append(", situacao=");
        builder.append(situacao);
        builder.append("]");
        return builder.toString();
    }
}
