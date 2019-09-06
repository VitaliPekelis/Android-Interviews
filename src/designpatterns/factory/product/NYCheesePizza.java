package designpatterns.factory.product;

public class NYCheesePizza implements Pizza {
    public NYCheesePizza() {
        System.out.println(this.getClass().getSimpleName() + "  was created");
        System.out.println("------------------------------------------------->");
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
        System.out.println("<-------------------------------------------------");
    }
}
