package singleton;
public class Counter {
    private static Counter singleton;

    private int value;

    private Counter () {
        value = 0;
    }

    public static Counter getInstance() {
        if (singleton == null) {
            singleton = new Counter();
        }
        return singleton;
    }

    public int increaseScore() {
        return ++value;
    }
}