package vlada.springframework.recipeapp.services;

import org.springframework.stereotype.Service;
import vlada.springframework.recipeapp.model.Recipe;
import vlada.springframework.recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeService_Impl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService_Impl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override                                         // ??? java 8 sintaksa
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
