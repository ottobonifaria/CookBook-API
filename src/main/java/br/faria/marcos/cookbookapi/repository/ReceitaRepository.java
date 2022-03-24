package br.faria.marcos.cookbookapi.repository;

import br.faria.marcos.cookbookapi.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, String> {
}