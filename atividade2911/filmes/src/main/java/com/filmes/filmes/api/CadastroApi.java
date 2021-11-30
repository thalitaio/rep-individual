package com.filmes.filmes.api;

import java.util.List;

import com.filmes.filmes.model.CadastroClientes;
import com.filmes.filmes.repository.CadastroClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroApi {
    @Autowired
    private CadastroClientesRepository repository;

    @GetMapping("/api/cadastro")
    public List<CadastroClientes> cadastros(){
        List<CadastroClientes> lista = (List<CadastroClientes>)repository.findAll();
        return lista;
    }

    @PostMapping("/api/cadastro")
    public String salvar(@RequestBody CadastroClientes model) {
        repository.save(model);
        return "Cliente cadastrado";
    }

    @DeleteMapping("/api/cadastro/{id}")
    public String deletar(@PathVariable int id) {
        repository.deleteById(id);
        return "Cliente deletado";
    }

    @PutMapping("/api/cadastro/{id}")
    public String update(@RequestBody CadastroClientes model, @PathVariable int id) {
        if (model.getId() == id) {
            repository.save(model);
            return "Cadastro alterado";
        }
        return "Id da URL não corresponde ao body";
    }
}
