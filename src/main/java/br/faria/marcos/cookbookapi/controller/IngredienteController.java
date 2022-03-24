package br.faria.marcos.cookbookapi.controller;

import br.faria.marcos.cookbookapi.model.Ingrediente;
import br.faria.marcos.cookbookapi.repository.IngredienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "ingrediente")
public class IngredienteController {

    private IngredienteRepository repository;

    public IngredienteController(IngredienteRepository repository) {
        this.repository = repository;
    }

    @RequestMapping
    public List<Ingrediente> getAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{nome}")
    public Ingrediente findByName(@PathVariable String nome) {
        return repository.getById(nome);
    }
}

