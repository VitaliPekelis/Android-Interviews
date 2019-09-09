package designpatterns.factory.product.ingredients;

public class ThinCrustDough extends Dough {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
