package designpatterns.factory;

import designpatterns.factory.product.Pizza;

public class PizzaFactoryApp {

    public static void main(String[] args) {
        PizzaStore chicagoStore = new PizzaStoreChicago();
        PizzaStore nyStore = new PizzaStoreNY();

        String[] types = {"cheese","greek","pepperoni"};
        for (String type : types) {
             Pizza pizza = chicagoStore.orderPizza(type);
             Pizza pizza2 = nyStore.orderPizza(type);
        }
    }
}
