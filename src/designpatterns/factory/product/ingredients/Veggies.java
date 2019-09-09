package designpatterns.factory.product.ingredients;

public class Veggies implements PizzaIngredient {
    private Vegetables[] veggies;
    
    public Veggies(Vegetables... veggies) {
        this.veggies = veggies;
    }

    public Vegetables[] getVeggies() {
        return veggies;
    }


    @Override
    public void printName() {
        System.out.print(getClass().getSimpleName()+": ");
        for (int i = 0; i < veggies.length; i++) {
            System.out.print( (i+1)+"."+ veggies[i]+" ");
        }
        System.out.println();
    }
}
