package designpatterns.factory.product.ingredients;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientsFactory{
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
