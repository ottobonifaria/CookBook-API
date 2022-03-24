package br.faria.marcos.cookbookapi.dto;

import br.faria.marcos.cookbookapi.enums.TipoMedida;
import br.faria.marcos.cookbookapi.model.ReceitaIngrediente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReceitaIngredienteDto {
    private String ingredienteNome;
    private Integer quantidade;

    private TipoMedida tipoMedida;
    //private String tipoMedida;

    public ReceitaIngredienteDto(ReceitaIngrediente receitaIngrediente) {
        this.ingredienteNome = receitaIngrediente.getIngrediente().getNome();
        this.quantidade = receitaIngrediente.getQuantidade();
        this.tipoMedida = receitaIngrediente.getTipoMedida();
    }
}
