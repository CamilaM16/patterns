package adapter;

public class Car {
    public enum Type {
        TOYOTA,
        NISAN
    }

    private double price;
    private Type type;

    public Car(double price, Type type) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public String toString (){
        return "{ "+type+", "+price+" }";
    }
}
