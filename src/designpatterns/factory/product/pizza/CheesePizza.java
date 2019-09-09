package designpatterns.factory.product.pizza;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        super();
        this.ingredientsFactory = ingredientsFactory;
    }


    @Override
    public void prepare() {
        System.out.println("begin preparing "+this.getClass().getSimpleName());
        addIngredient(cheese = ingredientsFactory.createCheese());
        addIngredient(dough = ingredientsFactory.createDough());
        addIngredient(sauce = ingredientsFactory.createSauce());
    }
}
