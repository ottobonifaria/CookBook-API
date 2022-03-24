package br.faria.marcos.cookbookapi.dto;

import br.faria.marcos.cookbookapi.model.Preparo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreparoDto {
    private Integer passo;
    private String descricao;

    public PreparoDto(Preparo preparo) {
        this.passo = preparo.getPasso();
        this.descricao = preparo.getDescricao();
    }
}