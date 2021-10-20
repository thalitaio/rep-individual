package atividade2010.model;

public class Filmes extends Conteudos{
    public String duracaoTotal;


    @Override
    public String toString() {
        String msg = super.toString() + "\nDuração do filme: " + this.duracaoTotal;
        return msg;
    }
}
