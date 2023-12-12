package behavioral.chainofresponsibility;

public class RequestBodyValidationHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void handle(HttpRequest httpRequest) {
        boolean isValid = validate(httpRequest);
        if (!isValid) {
            System.out.println("RequestBodyValidationHandler: failure");
            System.out.println("Stop ...");
            return;
        }

        System.out.println("RequestBodyValidationHandler: success");
        if (nextHandler != null) {
            System.out.println("Invoke next handler ...");
            nextHandler.handle(httpRequest);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextRequestHandler) {
        this.nextHandler = nextRequestHandler;
    }

    private boolean validate(HttpRequest httpRequest) {
        return httpRequest.getUserEmail() != null && httpRequest.getUserPassword() != null && httpRequest.getUserRole() != null;
    }
}
