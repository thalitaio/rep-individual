package com.springtop.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String stream_favorito;

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

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

   public void setIdade(int idade) {
       this.idade = idade;
   }
   public int getIdade() {
       return idade;
   }

    public void setStream_favorito(String stream_favorito) {
        this.stream_favorito = stream_favorito;
    }
    public String getStream_favorito() {
        return stream_favorito;
    }
}
