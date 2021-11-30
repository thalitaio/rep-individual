package com.filmes.filmes.repository;

import com.filmes.filmes.model.CadastroClientes;

import org.springframework.data.repository.CrudRepository;

public interface CadastroClientesRepository extends CrudRepository<CadastroClientes,Integer> {
    
}
