package adapter;

public class TaxHandlerOlder {

    double calculate(Car car, double tax) {
        return car.getPrice() * tax;
    }
}
