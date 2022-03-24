package br.faria.marcos.cookbookapi.controller;

import br.faria.marcos.cookbookapi.dto.PreparoDto;
import br.faria.marcos.cookbookapi.model.Preparo;
import br.faria.marcos.cookbookapi.repository.PreparoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "preparo")
public class PreparoController {
    private PreparoRepository repository;

    public PreparoController(PreparoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PreparoDto> getAll() {
        return repository.findAll().stream()
                .map(PreparoDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "{id}")
    public PreparoDto findById(@PathVariable Integer id) {
        return new PreparoDto(repository.getById(id));
    }
}