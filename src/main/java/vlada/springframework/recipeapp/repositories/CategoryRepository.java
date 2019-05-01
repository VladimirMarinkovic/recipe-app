package vlada.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.recipeapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
