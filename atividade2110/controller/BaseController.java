package atividade2110.controller;
import java.util.ArrayList;

public class BaseController <T>{
    private ArrayList<T> baseEnderecos;

    public BaseController(){
        this.baseEnderecos = new ArrayList<T>();
    }

    public void create(T obj) {
        this.baseEnderecos.add(obj);
    }

    public ArrayList<T> read() {
        return this.baseEnderecos;
    }

    public void updade(T obj) {
        if (this.baseEnderecos.contains(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.baseEnderecos.remove(obj);
    }
}
