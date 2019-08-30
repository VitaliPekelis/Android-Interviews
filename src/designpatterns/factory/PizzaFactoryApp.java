package designpatterns.factory;

public class PizzaFactoryApp {

    public static void main(String[] args) {
        PizzaFactoryApp app = new PizzaFactoryApp();
        String[] types = {"cheese","greek","pepperoni"};
        for (String type : types) {
            app.orderPizza(type);
        }
    }


    Pizza orderPizza(String type) {
        Pizza pizza = null;
        /*Pizza pizza = new PizzaImpl();*/
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
