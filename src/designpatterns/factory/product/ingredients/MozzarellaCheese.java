package designpatterns.factory.product.ingredients;

public class MozzarellaCheese extends Cheese {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
