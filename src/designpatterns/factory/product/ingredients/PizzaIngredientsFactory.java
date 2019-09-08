package designpatterns.factory.product.ingredients;

public abstract class PizzaIngredientsFactory {

    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract Veggies[] createVeggies();
    public abstract Dough createDough();

}
