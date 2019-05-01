package vlada.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.recipeapp.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
