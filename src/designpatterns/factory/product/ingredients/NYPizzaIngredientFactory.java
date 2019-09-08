package designpatterns.factory.product.ingredients;

public class NYPizzaIngredientFactory extends PizzaIngredientsFactory{
    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return null;
    }

    @Override
    public Dough createDough() {
        return null;
    }
}
