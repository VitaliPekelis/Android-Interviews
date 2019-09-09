package designpatterns.factory.product.ingredients;

public class ReggianoCheese extends Cheese {
    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
