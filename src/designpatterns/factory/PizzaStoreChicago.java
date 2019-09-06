package designpatterns.factory;

import designpatterns.factory.product.ChicagoCheesePizza;
import designpatterns.factory.product.ChicagoGreekPizza;
import designpatterns.factory.product.ChicagoPepperoniPizza;
import designpatterns.factory.product.Pizza;

public class PizzaStoreChicago extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
        }

        return pizza;
    }
}
