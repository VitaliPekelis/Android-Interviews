package designpatterns.factory.product.ingredients;

public class NYPizzaIngredientFactory extends PizzaIngredientsFactory{
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

}
