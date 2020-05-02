package com.recipeapp.app.repository;

import com.recipeapp.core.model.Recipe;
import com.recipeapp.core.port.out.RecipeRepositorySPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveRecipeRepository implements RecipeRepositorySPI {

    private final RecipeMongoRepository recipeMongoRepository;

    @Autowired
    public SaveRecipeRepository(final RecipeMongoRepository recipeMongoRepository) {
        this.recipeMongoRepository = recipeMongoRepository;
    }

    @Override
    public void saveRecipe(Recipe recipe) {
        this.recipeMongoRepository.save(recipe);
    }
}
