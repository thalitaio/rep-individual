package atividade2010.controller;

import java.util.ArrayList;

public class BaseController<T> {
    
    private ArrayList<T> conteudos;

    public BaseController(){
        this.conteudos = new ArrayList<T>();
    }

    public void create(T obj) {
        this.conteudos.add(obj);
    }

    public ArrayList<T> read(){
        return this.conteudos;
    }

    public void update(T obj){
        if (this.conteudos.contains(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.conteudos.remove(obj);
    }
}
