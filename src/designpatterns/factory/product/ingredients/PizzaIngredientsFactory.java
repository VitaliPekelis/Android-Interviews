package designpatterns.factory.product.ingredients;

public abstract class PizzaIngredientsFactory {

    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract Dough createDough();
    public abstract Clams createClams();

    public Veggies createVeggies(){
        return new Veggies(Vegetables.GARLIC, Vegetables.MUSHROOM, Vegetables.ONION, Vegetables.RED_PEPPER);
    }
}
