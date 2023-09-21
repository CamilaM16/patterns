package visitor.visitorimpl;

import visitor.elements.Hotel;
import visitor.elements.Museum;
import visitor.elements.Park;

public class Normal implements Visitor {

    @Override
    public String visitMuseum(Museum m) {
        return String.format("Visited Musum with %d", m.getPrice());
    }

    @Override
    public String visitPark(Park p) {
        return String.format("Visited Park with %d", p.getPrice());

    }

    @Override
    public String visitHotel(Hotel h) {
        if (h.getPrice() > 100) {
            return String.format("View Park with %d", h.getPrice());
        }
        return "Can acceess :)";
    }

}
