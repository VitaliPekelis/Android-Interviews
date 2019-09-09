package designpatterns.factory.store;

import designpatterns.factory.product.ingredients.ChicagoPizzaIngredientFactory;
import designpatterns.factory.product.pizza.CheesePizza;
import designpatterns.factory.product.pizza.GreekPizza;
import designpatterns.factory.product.pizza.ClamPizza;
import designpatterns.factory.product.pizza.Pizza;

public class PizzaStoreChicago extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(factory);
                break;
            case "greek":
                pizza = new GreekPizza(factory);
                break;
            case "pepperoni":
                pizza = new ClamPizza(factory);
                break;
        }

        return pizza;
    }
}
