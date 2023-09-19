package visitor.elements;

import visitor.visitorimpl.Visitor;

public class Museum implements Place{

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitMuseum(this);
    }
    
}
