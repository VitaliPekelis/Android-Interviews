package designpatterns.factory;

public class SimplePizzaFactory {

    public Pizza create(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
        }

        return pizza;
    }
}
