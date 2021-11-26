package com.springtop.banco.repository;

import com.springtop.banco.model.Clientes;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes, Integer> {
    
}
