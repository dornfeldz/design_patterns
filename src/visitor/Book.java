package visitor;

public class Book implements Item{
    private double price;
    private String title;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getTitle() { return title; }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
