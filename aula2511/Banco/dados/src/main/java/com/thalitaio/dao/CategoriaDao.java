package com.thalitaio.dao;

import java.util.List;
import javax.persistence.EntityManager;
import com.thalitaio.model.Categoria;

public class CategoriaDao {
    private EntityManager em;

    //conectando no banco
    public CategoriaDao(){
       this.em = new ConnectionFactory().getConnection();
    }
    //create
    public void create(Categoria model) {
        this.em.getTransaction().begin();
        this.em.persist(model);
        this.em.getTransaction().commit();
    }
    //read
    public List<Categoria> read() {
        return this.em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }
    //update
    public void update(Categoria model) {
        this.em.getTransaction().begin();
        this.em.merge(model);
        this.em.getTransaction().commit();
    }
    //delete
    public void delete(int id) {
        Categoria model = this.em.find(Categoria.class, id);
        this.em.getTransaction().begin();
        this.em.remove(model);
        this.em.getTransaction().commit();
    }
}
