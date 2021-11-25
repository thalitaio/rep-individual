package com.thalitaio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.thalitaio.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Dados de Categoria" );
        Categoria model = new Categoria();
        model.setNome("Nome teste");
        model.setDescricao("Nome teste");

        EntityManagerFactory factory= Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();

        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

        for(Categoria cat : lista){
            System.out.printf("ID: %d - Nome: %s - Descrição: %s \n", cat.getId(), cat.getNome(), cat.getDescricao());
        }

    }
}
