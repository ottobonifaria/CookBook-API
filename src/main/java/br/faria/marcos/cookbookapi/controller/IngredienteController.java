package br.faria.marcos.cookbookapi.controller;

import br.faria.marcos.cookbookapi.model.Ingrediente;
import br.faria.marcos.cookbookapi.repository.IngredienteRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "ingrediente")
public class IngredienteController {

    private IngredienteRepository repository;

    public IngredienteController(IngredienteRepository repository) {
        this.repository = repository;
    }

    @RequestMapping
    public List<Ingrediente> getAll(){
        return repository.findAll();
    }
}
