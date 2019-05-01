package vlada.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.recipeapp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
