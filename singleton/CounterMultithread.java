package singleton;

public class CounterMultithread {
    private static volatile CounterMultithread instance;

    private int value;

    private CounterMultithread() {
        value = 0;
    }

    public static CounterMultithread getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized(CounterMultithread.class) {
            if (instance == null) {
                instance = new CounterMultithread();
            }
            return instance;
        }
    }

    public synchronized int setValue(int value) {
        return this.value += value;
    }
}
