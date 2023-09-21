package visitor.visitorimpl;

import visitor.elements.Hotel;
import visitor.elements.Museum;
import visitor.elements.Park;

public interface Visitor {
    String visitMuseum(Museum m);

    String visitPark(Park p);

    String visitHotel(Hotel h);

}
