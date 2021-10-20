package atividade2010.model;

public class Conteudos {
    public String nome;
    public int ano;
    public String genero;
    public int id;

   /* @Override
    public boolean equals(Object obj) {
        Conteudos cId = (Conteudos)obj;
        if (this.id.equals(cId)) {
            System.out.println("uhul");
            return true;
        }
        return false;
    } */

    @Override
    public boolean equals(Object obj) {
        Conteudos c = (Conteudos)obj;
        if (this.id == c.id) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String msg = "\nNome: " + this.nome + "\nAno: " + this.ano + "\nGênero: " + this.genero;
        return msg;
    }
}
