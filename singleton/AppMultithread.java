package singleton;

public class AppMultithread {
    public static void main(String[] args) {
        Thread player = new Thread(new Player());
        Thread enemy = new Thread(new Enemy());

        player.start();
        enemy.start();
    }

    static class Player implements Runnable {
        @Override
        public void run() {
            CounterMultithread singleton = CounterMultithread.getInstance();
            singleton.setValue(10);
            singleton.setValue(10);
            singleton.setValue(10);

            int result = singleton.setValue(10);
            System.out.println("Player have:" + result);
        }
    }

    static class Enemy implements Runnable {
        @Override
        public void run() {
            CounterMultithread singleton = CounterMultithread.getInstance();
            int result = singleton.setValue(-10);
            System.out.println("[Enemy damage] Current Points: " + result);
        }
    }
}
