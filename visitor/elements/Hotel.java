package visitor.elements;

import visitor.visitorimpl.Visitor;

public class Hotel implements Place{

    @Override
    public int getPrice() {
        return 99999;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitHotel(this);
    }
    
}
