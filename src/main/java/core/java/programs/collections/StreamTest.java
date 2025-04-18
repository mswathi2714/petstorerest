package core.java.programs.collections;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {


    Recipe veganSalad;
    Recipe glutenFreeQuinoa;
    public Recipe getVeganSalad() {
        Recipe veganSalad = new Recipe();
        veganSalad.setId(1);
        veganSalad.setDietaryRestrictions(List.of("vegan"));
        veganSalad.setComplexity("easy");
        veganSalad.setIngredients(List.of("Lettuce", "Tomato", "Cucumber", "Olive Oil"));
        veganSalad.setInstructions(List.of(
                "1. Chop the lettuce, tomato, and cucumber.",
                "2. Mix with olive oil."
        ));
        return veganSalad;
    }

    public Recipe getGlutenFreeQuinoa() {
        Recipe glutenFreeQuinoa = new Recipe();
        glutenFreeQuinoa.setDietaryRestrictions(List.of("gluten-free"));
        glutenFreeQuinoa.setComplexity("medium");
        glutenFreeQuinoa.setIngredients(List.of("Quinoa", "Bell Pepper", "Corn", "Black Beans"));
        glutenFreeQuinoa.setInstructions(List.of(
                "1. Cook quinoa according to package instructions.",
                "2. Mix with diced bell pepper, corn, and black beans."
        ));
        return glutenFreeQuinoa;
    }

    public void setVeganSalad(Recipe veganSalad) {
        this.veganSalad = veganSalad;
    }

    public void setGlutenFreeQuinoa(Recipe glutenFreeQuinoa) {
        this.glutenFreeQuinoa = glutenFreeQuinoa;
    }
    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        List<Recipe> recipes = List.of(streamTest.getVeganSalad(), streamTest.getGlutenFreeQuinoa());
        Optional<String> dietaryRestrictions = Optional.empty();//Optional.of("vegan");
        Optional<String> complexity = Optional.of("easy");

        recipes =  recipes.stream()
                .filter(recipe -> recipe.getDietaryRestrictions().stream().anyMatch(
                        restriction-> {
                            return restriction.equalsIgnoreCase(dietaryRestrictions.get());
                        }))
                .filter(recipe -> recipe.getComplexity().equalsIgnoreCase(complexity.get()))
                .collect(Collectors.toList());
        System.out.println("Filtered Recipes: " + recipes.get(0).getIngredients());
        Recipe veganSalad = streamTest.getVeganSalad();
        Recipe glutenFreeQuinoa = streamTest.getGlutenFreeQuinoa();
        System.out.println("Vegan Salad: " + veganSalad.getIngredients());
        System.out.println("Gluten-Free Quinoa: " + glutenFreeQuinoa.getIngredients());

/*        List<Recipe> recipes =  recipesRepository.getAllRecipes().stream()
                .filter(recipe -> dietaryRestrictions.map(dr -> recipe.getDietaryRestrictions().stream()
                        .anyMatch(restriction -> restriction.equalsIgnoreCase(dr))).orElse(true))
                .filter(recipe -> complexity.map(c ->recipe.getComplexity().equalsIgnoreCase(c)).orElse(true))
                .collect(Collectors.toList());*/
    }
}
