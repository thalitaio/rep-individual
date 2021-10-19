package atividade1910;

public class Aluno extends Pessoa{
    //Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        Aluno a1 = (Aluno)obj;
        if (this.matricula.equals(a1.matricula) && this.turma.equals(a1.turma) && this.curso.equals(a1.curso)) {
            return true;
        }
        return false;
    } 

    @Override
    public String toString() {
        String mensagem = super.toString() + "\nMatrícula: " + this.matricula + "\nTurma: " + this.turma + "\nCurso: " + this.curso;
        return mensagem;
    }
}
