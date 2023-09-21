public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        Request request1 = new Request(RequestType.TYPE_A);
        Request request2 = new Request(RequestType.TYPE_B);
        Request request3 = new Request(RequestType.TYPE_C);

        handlerA.handleRequest(request1); 
        handlerA.handleRequest(request2); 
        handlerA.handleRequest(request3); // Not handle
    }
}
