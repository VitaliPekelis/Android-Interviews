package designpatterns.factory;

public class PizzaFactoryApp {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        String[] types = {"cheese","greek","pepperoni"};
        for (String type : types) {
             Pizza pizza = store.orderPizza(type);
        }
    }

}
