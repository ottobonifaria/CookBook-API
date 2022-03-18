package br.faria.marcos.cookbookapi.repository;


import br.faria.marcos.cookbookapi.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, String> {

}
