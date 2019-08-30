package designpatterns.factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing "+this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("baking "+this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println("cutting "+this.getClass().getSimpleName());
    }

    @Override
    public void box() {
        System.out.println("boxing "+this.getClass().getSimpleName());
    }
}
