package br.faria.marcos.cookbookapi.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "preparo", schema = "cookbook")
@Getter
@Setter


public class Preparo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "passo")
    private Integer passo;

    @Column(name = "descricao", length = 250)
    private String descricao;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Receita receita;
}
