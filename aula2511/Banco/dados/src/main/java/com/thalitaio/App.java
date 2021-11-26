package com.thalitaio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.thalitaio.dao.CategoriaDao;
import com.thalitaio.dao.ProdutoDao;
import com.thalitaio.model.Categoria;
import com.thalitaio.model.Produto;

public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Dados de Categoria" );
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        model.setId(9);
        model.setNome("UHUL  26/11");
        model.setDescricao("atualizado 26/11");

        dao.update(model);

    

        for(Categoria cat : dao.read()){
            System.out.printf("ID: %d - Nome: %s - Descrição: %s \n", cat.getId(), cat.getNome(), cat.getDescricao());
        }*/

        System.out.println( "Dados de Produto" );
        Produto model = new Produto();
        ProdutoDao dao = new ProdutoDao();
        model.setId(21);
        model.setNomezaum("UHUL  26/11");
        model.setDescricao("atualizado 26/11");
        model.setPreco(18.88f);
        model.setCatid(6);

        dao.update(model);

        for(Produto p : dao.read()){
            System.out.printf("ID: %d - Nome: %s - Preço: %.2f - Descrição: %s \n", p.getId(), p.getNomezaum(), p.getPreco(), p.getDescricao());
        }


    }
}
