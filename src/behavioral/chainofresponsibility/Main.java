package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        RequestHandler requestBodyValidationHandler = new RequestBodyValidationHandler();
        RequestHandler authenticationHandler = new AuthenticationHandler();
        RequestHandler authorizationHandler = new AuthorizationHandler();

        requestBodyValidationHandler.setNextHandler(authenticationHandler);
        authenticationHandler.setNextHandler(authorizationHandler);

        HttpRequest httpRequest1 = new HttpRequest("example.com", "/api/data", null, null, null);
        HttpRequest httpRequest2 = new HttpRequest("example.com", "/api/data", "user@example.com", "12345678", "admin");
        HttpRequest httpRequest3 = new HttpRequest("example.com", "/api/data", "admin@example.com", "12345678", "admin");

        requestBodyValidationHandler.handle(httpRequest1);
        requestBodyValidationHandler.handle(httpRequest2);
        requestBodyValidationHandler.handle(httpRequest3);
    }
}
