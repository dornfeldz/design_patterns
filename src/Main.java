import decorator.BasicCar;
import decorator.Car;
import decorator.SportsCar;
import factory.Notification;
import observer.Investor;
import observer.Observer_;
import observer.Stock;
import singleton.Singleton;
import factory.NotificationFactory;
import strategy.QuickSort;
import strategy.Sorter;

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
    }
}