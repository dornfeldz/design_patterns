package visitor;

public class ShoppingCart implements Visitor{
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + " costs " + book.getPrice());
    }

    public void visit(Fruit fruit) {
        System.out.println("Fruit: " + fruit.getName() + " costs " + fruit.getPrice());
    }
}
