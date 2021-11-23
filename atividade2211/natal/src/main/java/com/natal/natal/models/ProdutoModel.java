package com.natal.natal.models;

public class ProdutoModel {

    private int id;
    private String nome;
    private float valor;
    private int idCategoria;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public int getIdCategoria() {
        return idCategoria;
    }

}
