package com.thalitaio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float preco;
    private String nomezaum;
    private String descricao;
    private int catid;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNomezaum(String nomezaum) {
        this.nomezaum = nomezaum;
    }
    public String getNomezaum() {
        return nomezaum;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }
    public int getCatid() {
        return catid;
    }

}
