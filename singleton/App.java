package singleton;

public class App {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();
        
        counter1.increaseScore();// 1
        counter1.increaseScore();// 2
        counter1.increaseScore();// 3
        
        int currentScore = counter2.increaseScore(); // 4
        System.out.println(currentScore);
    }
}
