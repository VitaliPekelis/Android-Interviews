package designpatterns.factory.product;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public abstract class Pizza {

    protected PizzaIngredientsFactory ingredientsFactory;

    public Pizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    abstract void prepare();

    public void bake() {
        System.out.println("baking "+this.getClass().getSimpleName());
    }

    public void cut() {
        System.out.println("cutting "+this.getClass().getSimpleName() +" to slices");
    }

    void box() {
        System.out.println("boxing " + this.getClass().getSimpleName());
        System.out.println("<-------------------- END ---------------------->");
    }
}
