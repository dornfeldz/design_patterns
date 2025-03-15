package observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Observer_> observers = new ArrayList<>();
    private float price;

    public void addObserver(Observer_ observer){
        observers.add(observer);
    }

    public void setPrice(float price){
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers(){
        for (Observer_ observer : observers){
            observer.update(price);
        }
    }
}
