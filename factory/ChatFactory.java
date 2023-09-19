package factory;

public class ChatFactory extends Factory {

    @Override
    Task createTask() {
        return new OpenAi();
    }

}