package designpatterns.factory.product.pizza;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public class GreekPizza extends Pizza {

    public GreekPizza(PizzaIngredientsFactory ingredientsFactory) {
        super();
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("begin preparing "+this.getClass().getSimpleName());
        addIngredient(ingredientsFactory.createDough());
        addIngredient(ingredientsFactory.createCheese());
        addIngredient(ingredientsFactory.createSauce());
        addIngredient(ingredientsFactory.createVeggies());
    }
}
