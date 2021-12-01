package com.filmes.filmes.api;

import java.util.List;

import com.filmes.filmes.model.TipoCliente;
import com.filmes.filmes.repository.TipoClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteApi {
    @Autowired
    private TipoClienteRepository repository;

    @GetMapping
    public List<TipoCliente> list(){
        return (List<TipoCliente>)repository.findAll();
        
    }

    @PostMapping
    public String create(@RequestBody TipoCliente model) {
        repository.save(model);
        return "Salvo";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody TipoCliente model){
        model.setId(id);
        repository.save(model);
        return "Alterado!";     
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        repository.deleteById(id);
        return "Deletado!";
    }
}
