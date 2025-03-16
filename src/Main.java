import adapter.MediaAdapter;
import adapter.MediaPlayer;
import adapter.VLCPlayer;
import decorator.BasicCar;
import decorator.Car;
import decorator.SportsCar;
import factory.Notification;
import observer.Investor;
import observer.Observer_;
import observer.Stock;
import prototype.Sheep;
import proxy.Internet;
import proxy.InternetProxy;
import singleton.Singleton;
import factory.NotificationFactory;
import strategy.QuickSort;
import strategy.Sorter;
import template.Beverage;
import template.Coffee;
import template.Tea;
import visitor.Book;
import visitor.Fruit;
import visitor.Item;
import visitor.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Singleton Test
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Factory test
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.notifyUsers();

        // Strategy test
        Sorter sorter = new Sorter();
        sorter.setStrategy(new QuickSort());
        sorter.sortNumbers(new int[]{5, 3, 8, 4});

        // Observer test
        Stock stock = new Stock();
        Observer_ investor1 = new Investor("Alice");
        stock.addObserver(investor1);
        stock.setPrice(120.5f);

        // Decorator test
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        // Prototype test
        Sheep original = new Sheep("Dolly");
        Sheep cloned = (Sheep) original.clone();
        System.out.println(cloned.getName());

        // Adapter test
        MediaPlayer player = new MediaAdapter(new VLCPlayer());
        player.play("movie.mp4");

        // Template test
        Beverage tea = new Tea();
        tea.prepareRecipe();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        // Proxy test
        Internet internet = new InternetProxy();
        internet.connectTo("google.com");
        internet.connectTo("badwebsite.com");

        // Visitor test
        Item book = new Book("Design Patterns", 50.0);
        Item apple = new Fruit("apple", 2.5);
        ShoppingCart cart = new ShoppingCart();
        book.accept(cart);
        apple.accept(cart);
    }
}