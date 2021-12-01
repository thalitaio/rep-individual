package com.filmes.filmes.repository;

import com.filmes.filmes.model.TipoCliente;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TipoClienteRepository extends PagingAndSortingRepository<TipoCliente,Integer>{
    
}
