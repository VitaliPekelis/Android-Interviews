package designpatterns.factory.product.pizza;

import designpatterns.factory.product.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected PizzaIngredientsFactory ingredientsFactory;

    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Clams clams;

    public Veggies veggies;

    private List<PizzaIngredient> allIngredients;

    public Pizza() {
        allIngredients = new ArrayList<>();
        System.out.println("<--------------------- START ------------------------>");
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("baking "+this.getClass().getSimpleName());
    }

    public void cut() {
        System.out.println("cutting "+this.getClass().getSimpleName() +" to slices");
    }

    public void box() {
        System.out.println("boxing " + this.getClass().getSimpleName());
    }

    public void addIngredient(PizzaIngredient ingredient){
        allIngredients.add(ingredient);
    }

    public void printAllIngredients() {
        int count = 0;
        if(allIngredients!=null){
            count = allIngredients.size();
        }
        System.out.println("Ingredients: -> count = " + count);

        for (PizzaIngredient ingredient : allIngredients) {
            ingredient.printName();
        }


    }
}
