package com.filmes.filmes.repository;

import java.util.List;

import com.filmes.filmes.model.CadastroClientes;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CadastroClientesRepository extends PagingAndSortingRepository<CadastroClientes,Integer> {
   @Override
    default Iterable<CadastroClientes> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    List<CadastroClientes> findByNome(String nome);
}
