package behavioral.chainofresponsibility;

public interface RequestHandler {
    void handle(HttpRequest httpRequest);

    void setNextHandler(RequestHandler nextRequestHandler);
}
