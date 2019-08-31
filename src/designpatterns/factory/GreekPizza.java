package designpatterns.factory;

public class GreekPizza implements Pizza {
    public GreekPizza() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

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
