package template;

public abstract class Beverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        purInCup();
        addCondiments();
    }

    private void boilWater(){
        System.out.println("Boiling water...");
    }

    private void purInCup(){
        System.out.println("Pouring into cup...");
    }

    abstract void brew();
    abstract void addCondiments();
}
