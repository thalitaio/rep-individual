/*
_ Crie uma classe produto com os atributos Código, Nome, Descrição e Valor. OK
_ Todos os atributos da classe produtos devem ser privados. OK
_ Construa os métodos get e set para cada um dos atributos. OK
_ Crie uma classe Conta Corrente com os atributos Agência, Numero, Codigo do Cliente e Saldo. OK
_ Todos os atributos da classe Conta Corrente devem ser privados.OK
_ Construa os métodos get e set para cada um dos atributos da classe.OK
_ Crie uma classe Tela Principal Loja que contenha um método main. OK
_ Nesta classe, crie um objeto da Produto, realize a chamada a todos os métodos set e get, ao final da execução, imprima o valor de todos os atributos da classe. OK
_ Crie uma classe Tela Principal Banco que contenha um método main. OK
_ Nesta classe, crie um objeto da Conta Corrente, realize a chamada a todos os métodos set e get, ao final da execução, imprima o valor de todos os atributos da classe.


*/



package atividade0410;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

}
