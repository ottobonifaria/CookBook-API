package br.faria.marcos.cookbookapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingrediente", schema = "cookbook")
@Getter
@Setter
@EqualsAndHashCode()

public class Ingrediente {
    @Id
    @Column(name = "nome",length = 120)
    @EqualsAndHashCode.Include
    private String nome;

    @Column(name="descricao",length = 250)
    private  String descricao;


}
