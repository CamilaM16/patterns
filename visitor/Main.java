package visitor;

import visitor.elements.Hotel;
import visitor.elements.Museum;
import visitor.elements.Park;
import visitor.visitorimpl.Normal;
import visitor.visitorimpl.Rich;

public class Main {
    public static void main(String[] args) {
        Park p = new Park();
        Hotel h = new Hotel();
        Museum m = new Museum();

        Normal normal = new Normal();
        Rich rich = new Rich();

        System.out.println(p.accept(rich));
        System.out.println(h.accept(rich));
        System.out.println(m.accept(rich));
        System.out.println(p.accept(normal));
        System.out.println(h.accept(normal));
        System.out.println(m.accept(normal));

    }
}
