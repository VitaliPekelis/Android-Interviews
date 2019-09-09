package designpatterns.factory.product.ingredients;

public class ThickCrustDough extends Dough {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
