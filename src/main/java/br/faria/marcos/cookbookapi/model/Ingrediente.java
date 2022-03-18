package br.faria.marcos.cookbookapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ingrediente {
    @Id
    @Column(name = "nome",length = 120)
    @EqualsAndHashCode.Include
    private String nome;

    @Column(name="descricao",length = 250)
    private  String descricao;


}
