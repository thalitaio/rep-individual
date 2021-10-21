package atividade2110.model;

public class Endereco extends Base{
    public String rua;
    public int numero;
    public String complemento;
    public String cidade;
    public String cep;
    public String estado;
    public String pais;


    @Override
    public String toString() {
        String retorno = super.toString() + "\nRua: " + this.rua + "\nNumero: " + this.numero + "\nComplementp: " + this.complemento + "\nCidade: " + this.cidade + "\nCep: " + this.cep + "\nPaís: " + this.pais + "\nEstado: " + this.estado;

        return retorno;
    }
}
