package designpatterns.factory.product;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        super(pizzaIngredientsFactory);
        System.out.println(this.getClass().getSimpleName() + " was created");
        System.out.println("------------------------------------------------->");
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+this.getClass().getSimpleName());
    }
}
