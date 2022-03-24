package br.faria.marcos.cookbookapi.controller;

import br.faria.marcos.cookbookapi.dto.ReceitaDto;
import br.faria.marcos.cookbookapi.repository.ReceitaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@
        RequestMapping(path = "receita")
public class ReceitaController {
    private ReceitaRepository repository;

    public ReceitaController(ReceitaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ReceitaDto> getAll() {
        return repository.findAll().stream().map(ReceitaDto::new).collect(Collectors.toList());
    }

    @GetMapping(path = "/{nome}")
    public ReceitaDto findById(@PathVariable String nome) {
        return new ReceitaDto(repository.getById(nome));
    }
}
