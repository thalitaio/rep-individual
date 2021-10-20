package atividade2010.model;

public class Series extends Conteudos{
    public int temporadas;

    @Override
    public String toString() {
        String msg = super.toString() + "\nID: " + this.id + "\n" + this.temporadas;
        return msg;
    }
}
