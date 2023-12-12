package behavioral.chainofresponsibility;

public class AuthorizationHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void handle(HttpRequest httpRequest) {
        boolean isAuthorized = authorize(httpRequest);

        if (!isAuthorized) {
            System.out.println("AuthorizationHandler: failure");
            System.out.println("Stop ...");
            return;
        }


        System.out.println("AuthorizationHandler: success");
        if (nextHandler != null) {
            System.out.println("Invoke next handler ...");
            nextHandler.handle(httpRequest);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextRequestHandler) {
        this.nextHandler = nextRequestHandler;
    }

    private boolean authorize(HttpRequest httpRequest) {
        return httpRequest.getUserRole().equals("admin");
    }
}

