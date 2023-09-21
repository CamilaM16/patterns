package visitor.elements;

import visitor.visitorimpl.Visitor;

public class Park implements Place{

    @Override
    public int getPrice() {
        return 3;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPark(this);
    }
    
}
