package visitor.elements;

import visitor.visitorimpl.Visitor;

public interface Place {
    int getPrice();
    String accept(Visitor visitor);
}
