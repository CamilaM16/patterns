
public interface Handler {
    void handleRequest(Request request);

    void setNextHandler(Handler handlerB);
}
