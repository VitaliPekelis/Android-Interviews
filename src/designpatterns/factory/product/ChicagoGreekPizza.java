package designpatterns.factory.product;

import designpatterns.factory.product.ingredients.PizzaIngredientsFactory;

public class ChicagoGreekPizza extends Pizza {

    public ChicagoGreekPizza(PizzaIngredientsFactory ingredientsFactory) {
        super(ingredientsFactory);
        System.out.println(this.getClass().getSimpleName() + " was created");
        System.out.println("------------------------------------------------->");
    }

    @Override
    public void prepare() {
        ingredientsFactory.createDough();
        ingredientsFactory.createCheese();
        ingredientsFactory.createSauce();
        ingredientsFactory.createVeggies();
        System.out.println("preparing "+this.getClass().getSimpleName());
    }

}
