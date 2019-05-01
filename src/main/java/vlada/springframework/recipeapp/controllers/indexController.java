package vlada.springframework.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vlada.springframework.recipeapp.services.RecipeService;

@Controller
public class indexController {

    private final RecipeService recipeService;

    public indexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";

    }
}
