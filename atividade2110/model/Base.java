package atividade2110.model;

public class Base {
    public int id;
    
    @Override
    public boolean equals(Object obj) {
        Base e = (Base)obj;
        if (this.id == e.id) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String retorno = "\nID: " + this.id;
        return retorno;
    }
}
