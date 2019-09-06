package designpatterns.factory;

import designpatterns.factory.product.Pizza;

public abstract class PizzaStore {
    /*SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    Pizza orderPizza(String type) {
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
