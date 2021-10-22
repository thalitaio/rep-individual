package atividade2210BrunaThalita.models;

public class Categorias extends Base{
    public String tipo;
    public String voltagem;
    public double preco;

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + this.tipo + "\nVoltagem: " + this.voltagem + "\nPreço: " + this.preco + "\n";
    }
}