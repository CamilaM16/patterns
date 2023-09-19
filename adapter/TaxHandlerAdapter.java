package adapter;

import adapter.Car.Type;

public class TaxHandlerAdapter implements TaxHandler {
    private TaxHandlerOlder older;

    public TaxHandlerAdapter (TaxHandlerOlder  older) {
        this.older = older;
    }
    @Override
    public Tax calculate(Car car) {
        double tax = getTaxByType(car.getType());
        double result = car.getPrice();
        if (tax > 0) {
            result = older.calculate(car, tax);
        }
        return new Tax(tax, result);
    }

    private double getTaxByType(Type type) {
        double tax = 0;
        switch (type) {
            case TOYOTA:
                tax = 0.9;
                break;
            case NISAN:
                tax = 0.76;
                break;
            default:
                tax = 0.1;
                break;
        }
        return tax;
    }
}
