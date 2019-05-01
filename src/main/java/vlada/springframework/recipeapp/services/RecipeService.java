package vlada.springframework.recipeapp.services;

import org.springframework.stereotype.Service;
import vlada.springframework.recipeapp.model.Recipe;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
