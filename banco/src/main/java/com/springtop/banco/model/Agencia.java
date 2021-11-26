package com.springtop.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bairro;
    private String nome;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return bairro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
