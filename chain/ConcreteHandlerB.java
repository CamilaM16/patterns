class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_B) {
            System.out.println("Handled by ConcreteHandlerB");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}