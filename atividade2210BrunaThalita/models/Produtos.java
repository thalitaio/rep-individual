package atividade2210BrunaThalita.models;

public class Produtos extends Base{
    public String eletrodomestico;
    public Categorias catProduto;

    @Override
    public String toString() {
        return "\nEletrodomestico: " + this.eletrodomestico + this.catProduto;
    }
}