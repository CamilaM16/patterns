package factory;

public class OpenAi implements Task {
    public String chat() {
        return "Response chat";
    }

    @Override
    public String run() {
        return "Chat.. loading";
    }
}
