package com.thalitaio.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    private EntityManager em;

    public ConnectionFactory(){
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("banco");
        this.em = factory.createEntityManager();
    }

    public EntityManager getConnection(){
        return em;
    }
}
