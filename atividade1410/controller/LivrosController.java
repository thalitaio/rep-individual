package atividade1410.controller;
//_  A controller deve possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados.

import java.util.ArrayList;

import atividade1410.model.Livros;

public class LivrosController {
    private ArrayList<Livros> books = new ArrayList<Livros>();

    public void create(Livros l){
        books.add(l);
    }

    public ArrayList<Livros> listar(){
        return books;
    }

    public void update(Livros l){
        if(books.contains(l)){
            this.delete(l);
            this.create(l);
        }
    }

    public void delete(Livros l){
        books.remove(l);
    }
    
}
