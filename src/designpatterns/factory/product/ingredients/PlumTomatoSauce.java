package designpatterns.factory.product.ingredients;

public class PlumTomatoSauce extends Sauce {
    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
