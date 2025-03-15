package observer;

public class Investor implements Observer_ {
    private String name;

    public Investor(String name){
        this.name = name;
    }

    public void update(float stockPrice) {
        System.out.println(name + " received stock price update: " + stockPrice);
    }
}
