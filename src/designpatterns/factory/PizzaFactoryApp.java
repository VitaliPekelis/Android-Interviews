package designpatterns.factory;

import designpatterns.factory.product.pizza.Pizza;
import designpatterns.factory.store.PizzaStore;
import designpatterns.factory.store.PizzaStoreChicago;
import designpatterns.factory.store.PizzaStoreNY;

public class PizzaFactoryApp {

    public static void main(String[] args) {
        PizzaStore chicagoStore = new PizzaStoreChicago();
        PizzaStore nyStore = new PizzaStoreNY();

        String[] types = {"cheese","greek","pepperoni"};
        for (String type : types) {
            Pizza pizza = chicagoStore.orderPizza(type);
            pizza.printAllIngredients();
            System.out.println("<-------------------- END ---------------------->");
            Pizza pizza2 = nyStore.orderPizza(type);
            pizza2.printAllIngredients();
            System.out.println("<-------------------- END ---------------------->");
        }
    }
}
