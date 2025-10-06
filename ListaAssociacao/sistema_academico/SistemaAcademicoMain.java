package sistema_academico;
public class SistemaAcademicoMain {
    public static void main(String[] args) {
        Professor p = new Professor("Carlos");
        Disciplina d = new Disciplina("Programação", p);
        Fase f = new Fase(1, d);
        Curso c = new Curso("Engenharia de Software", f);
        Aluno a = new Aluno("Gustavo", c);
        Matricula m = new Matricula(a, "Aprovado");
        Notas n = new Notas(m, 9.0);
        Frequencia freq = new Frequencia(m, 28);

        System.out.println(p);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(a);
        System.out.println(m);
        System.out.println(n);
        System.out.println(freq);
    }
}
