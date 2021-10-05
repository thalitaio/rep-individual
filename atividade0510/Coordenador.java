package atividade0510;

public class Coordenador extends Funcionarios{
    private String curso_coordenado;
    private int bonus;

    public void setCurso_coordenado(String curso_coordenado) {
        this.curso_coordenado = curso_coordenado;
    }
    public String getCurso_coordenado() {
        return curso_coordenado;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
}
