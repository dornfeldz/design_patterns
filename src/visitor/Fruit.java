package visitor;

public class Fruit implements Item{
    private double price;
    private String name;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
