class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_A) {
            System.out.println("Handled by ConcreteHandlerA");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}