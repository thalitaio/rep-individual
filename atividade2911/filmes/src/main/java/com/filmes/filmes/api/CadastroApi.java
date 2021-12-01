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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroApi {
    @Autowired
    private CadastroClientesRepository repository;

    @GetMapping
    public List<CadastroClientes> cadastros(String nome){
        if (nome != null) {
            return  (List<CadastroClientes>)repository.findByNome(nome);
        }
        return (List<CadastroClientes>)repository.findAll();
    }

    @PostMapping
    public String salvar(@RequestBody CadastroClientes model) {
        repository.save(model);
        return "Cliente cadastrado";
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id) {
        repository.deleteById(id);
        return "Cliente deletado";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody CadastroClientes model, @PathVariable int id) {
        if (model.getId() == id) {
            repository.save(model);
            return "Cadastro alterado";
        }
        return "Id da URL não corresponde ao body";
    }
}
