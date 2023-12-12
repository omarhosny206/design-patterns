package behavioral.chainofresponsibility;

public class AuthenticationHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void handle(HttpRequest httpRequest) {
        boolean isAuthenticated = authenticate(httpRequest);
        if (!isAuthenticated) {
            System.out.println("AuthenticationHandler: failure");
            System.out.println("Stop ...");
            return;
        }

        System.out.println("AuthenticationHandler: success");
        if (nextHandler != null) {
            System.out.println("Invoke next handler ...");
            nextHandler.handle(httpRequest);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextRequestHandler) {
        this.nextHandler = nextRequestHandler;
    }

    private boolean authenticate(HttpRequest httpRequest) {
        return httpRequest.getUserEmail().equals("admin@example.com") && httpRequest.getUserPassword().equals("12345678");
    }
}
