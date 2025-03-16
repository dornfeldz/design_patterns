package prototype;

public class Sheep implements Prototype{
    private String name;

    public Sheep(String name){
        this.name = name;
    }

    public Prototype clone(){
        return new Sheep(this.name);
    }

    public String getName(){
        return name;
    }
}
