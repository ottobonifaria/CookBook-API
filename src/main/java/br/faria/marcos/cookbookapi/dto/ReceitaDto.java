package br.faria.marcos.cookbookapi.dto;

import br.faria.marcos.cookbookapi.enums.Categoria;
import br.faria.marcos.cookbookapi.enums.RendimentoTipo;
import br.faria.marcos.cookbookapi.model.Preparo;
import br.faria.marcos.cookbookapi.model.Receita;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
public class ReceitaDto {
    private final String nome;
    private final Categoria categoria;
    //private final String categoria;
    private final Integer tempoPreparo;
    private final RendimentoTipo rendimentoTipo;
    //private final String rendimentoTipo;
    private final Integer rendimentoQuantidade;
    private final Map<Integer, String> preparos;
    private final List<ReceitaIngredienteDto> ingredientes;

    public ReceitaDto(Receita receita) {
        this.nome = receita.getNome();
        this.categoria = receita.getCategoria();
        this.tempoPreparo = receita.getTempoPreparo();
        this.rendimentoTipo = receita.getRendimentoTipo();
        this.rendimentoQuantidade = receita.getRendimentoQuantidade();
        this.preparos = receita.getPreparos().stream().collect(Collectors.toMap(Preparo::getPasso, Preparo::getDescricao));
        this.ingredientes = receita.getIngredientes().stream().map(ReceitaIngredienteDto::new).collect(Collectors.toList());
    }
}