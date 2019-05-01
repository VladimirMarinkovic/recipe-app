package vlada.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.recipeapp.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
