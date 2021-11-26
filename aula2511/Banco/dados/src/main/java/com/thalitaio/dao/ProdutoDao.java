package com.thalitaio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.thalitaio.model.Produto;

public class ProdutoDao {
    private EntityManager em;

    //conectando no banco
    public ProdutoDao(){
       this.em = new ConnectionFactory().getConnection();
    }
    //create
    public void create(Produto model) {
        this.em.getTransaction().begin();
        this.em.persist(model);
        this.em.getTransaction().commit();
    }
    //read
    public List<Produto> read() {
        return this.em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }
    //update
    public void update(Produto model) {
        this.em.getTransaction().begin();
        this.em.merge(model);
        this.em.getTransaction().commit();
    }
    //delete
    public void delete(int id) {
        Produto model = this.em.find(Produto.class, id);
        this.em.getTransaction().begin();
        this.em.remove(model);
        this.em.getTransaction().commit();
    }
}
