package designpatterns.factory.store;

import designpatterns.factory.product.ingredients.NYPizzaIngredientFactory;
import designpatterns.factory.product.pizza.CheesePizza;
import designpatterns.factory.product.pizza.ClamPizza;
import designpatterns.factory.product.pizza.GreekPizza;
import designpatterns.factory.product.pizza.Pizza;

public class PizzaStoreNY extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();

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
