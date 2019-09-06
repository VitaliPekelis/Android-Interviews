package designpatterns.factory;

import designpatterns.factory.product.NYCheesePizza;
import designpatterns.factory.product.NYGreekPizza;
import designpatterns.factory.product.NYPepperoniPizza;
import designpatterns.factory.product.Pizza;

public class PizzaStoreNY extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "greek":
                pizza = new NYGreekPizza();
                break;
            case "pepperoni":
                pizza = new NYPepperoniPizza();
                break;
        }

        return pizza;
    }
}
