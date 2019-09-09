package designpatterns.factory.store;

import designpatterns.factory.product.pizza.Pizza;

public abstract class PizzaStore {
    /*SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    public Pizza orderPizza(String type) {
        Pizza pizza = /*factory.create(type)*/ createPizza(type);

        if (pizza!=null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
