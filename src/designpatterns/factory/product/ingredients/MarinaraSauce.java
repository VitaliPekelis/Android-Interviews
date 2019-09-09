package designpatterns.factory.product.ingredients;

public class MarinaraSauce extends Sauce {
    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}
