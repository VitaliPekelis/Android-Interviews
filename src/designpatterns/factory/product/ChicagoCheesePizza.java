package designpatterns.factory.product;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        super(ingredientsFactory);
        System.out.println(this.getClass().getSimpleName() + "  was created");
        System.out.println("------------------------------------------------->");
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+this.getClass().getSimpleName());
    }
}
