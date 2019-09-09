package designpatterns.factory.product.ingredients;

public class FreshClams extends Clams {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
