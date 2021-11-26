package com.thalitaio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.thalitaio.dao.CategoriaDao;
import com.thalitaio.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Dados de Categoria" );
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        model.setId(9);
        model.setNome("UHUL  26/11");
        model.setDescricao("atualizado 26/11");

        dao.update(model);

    

        for(Categoria cat : dao.read()){
            System.out.printf("ID: %d - Nome: %s - Descrição: %s \n", cat.getId(), cat.getNome(), cat.getDescricao());
        }

    }
}
