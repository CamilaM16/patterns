package adapter;

import adapter.Car.Type;

public class App {
    public static void main(String[] args) {
        TaxHandlerOlder old = new TaxHandlerOlder();
        TaxHandler handler = new TaxHandlerAdapter(old);

        Car car = new Car(1298798, Type.TOYOTA);
        System.out.println(handler.calculate(car));
    }
}
