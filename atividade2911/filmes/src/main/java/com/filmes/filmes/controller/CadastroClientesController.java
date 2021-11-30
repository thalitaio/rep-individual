package com.filmes.filmes.controller;

import java.util.List;
import com.filmes.filmes.model.CadastroClientes;
import com.filmes.filmes.repository.CadastroClientesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroClientesController {
    private CadastroClientesRepository repository;

    public CadastroClientesController(CadastroClientesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/cadastro")
    public String cadastroClientes(Model req){
        List<CadastroClientes> lista = (List<CadastroClientes>)repository.findAll();
        req.addAttribute("lista", lista);
        return "cadastro-clientes";
    }

    @GetMapping("/cadastro/form")
    public String formulario(Model req){
        CadastroClientes model = new CadastroClientes();
        req.addAttribute("model", model);
        return "cadastro-clientes-form";
    }

    @PostMapping("/cadastro/salvar")
    public String salvar(CadastroClientes model) {
        repository.save(model);
        return "redirect:/cadastro";
    }

    @GetMapping("/cadastro/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/cadastro";
    }

    @GetMapping("/cadastro/editar/{id}")
    public String editar(@PathVariable int id, Model req) {
        CadastroClientes model = repository.findById(id).get();
        req.addAttribute("model", model);
        return "cadastro-clientes-form";
    }
}
