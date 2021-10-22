package atividade2210BrunaThalita.controllers;
import java.util.ArrayList;



public class BaseController <T> {

    private ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<T>();

    }

    //create

    public void create(T obj) {

        this.dados.add(obj);

    }

    //read

    public ArrayList<T> read() {
        return this.dados;  
    }


    //updade
    public void update(T obj){
        if(this.dados.contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public boolean contains(T obj) {
        return this.dados.contains(obj);
    }

    //delete
    public void delete(T obj){
        this.dados.remove(obj);
    }
}