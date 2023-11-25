# Strategy Design Pattern

## Overview

The Strategy Design Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each
algorithm, and makes them interchangeable. It allows the client to choose the appropriate algorithm at runtime, making
it easy to switch between different strategies without altering the client code.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/0db2949f-13e5-4ab4-a9ae-aad22be4d480" alt="UML">
</p>

## Implementation Details

The example consists of multiple classes and interfaces: [🔗](./)

1. `PaymentStrategy`: an interface that declares the pay method, serving as the common interface for all payment
   strategies.

2. `CreditCardPaymentStrategy`: a class that implements the PaymentStrategy interface. It provides a specific
   implementation of the pay method for credit card payments.

3. `PaypalPaymentStrategy` : a class that aslo implements the PaymentStrategy interface, offering an implementation of
   the pay method for Paypal payments.

4. `Context`: a class that acts as a context for payment, allowing the client to choose and use different payment
   strategies. It composes a `PaymentStartegy` and has a `pay` method that delegates the payment process to the chosen `PaymentStrategy`.

## Usage

```java
PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy();

Context creditCardPaymentContext = new Context(creditCardPaymentStrategy);
Context paypalPaymentContext = new Context(paypalPaymentStrategy);

creditCardPaymentContext.pay();
paypalPaymentContext.pay();
```