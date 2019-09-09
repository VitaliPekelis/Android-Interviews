package designpatterns.factory.product.ingredients;

public class FrozenClams extends Clams {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
