package visitor.visitorimpl;

import visitor.elements.Hotel;
import visitor.elements.Museum;
import visitor.elements.Park;

public class Rich implements Visitor{

    @Override
    public String visitMuseum(Museum m) {
        return String.format("Rich Visited Musum with %d", m.getPrice());
    }

    @Override
    public String visitPark(Park p) {
        return String.format("Rich Visited Park with %d", p.getPrice());
    }

    @Override
    public String visitHotel(Hotel h) {
        return String.format("Rich Visited Hotel with %d", h.getPrice());
    }
    
}
