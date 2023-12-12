# Chain of Responsibility Design Pattern

## Overview

The Chain of Responsibility Design Pattern is a behavioral pattern that allows you to chain a series of processing
objects to handle a request. Each object in the chain either processes the request or passes it to the next handler in
the chain. This pattern promotes loose coupling between senders and receivers of a request.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/c598405b-ce9a-40fc-a3fb-39743ec31a8e" alt="UML">
</p>

## Implementation Details

The structure:

1. `Handler`: An interface or abstract class that defines the common interface for handling requests with the ability to
   add a next handler.

2. `ConcreteHandler1, ...ConcreteHandlerN`: Concrete classes that implement the `Handler` interface. Each handler
   decides
   whether to handle the request or pass it to the next handler in the chain.

The example consists of multiple classes and interfaces: [🔗](./)

1. `RequestHandler`: An interface that declares methods for handling requests and setting the next handler in the chain.

2. `RequestBodyValidationHandler & AuthenticationHandler & AuthorizationHandler`: are the concrete classes that implement
   the `RequestHandler` interface and handle specific aspects of the request.

## Usage

```java
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
```