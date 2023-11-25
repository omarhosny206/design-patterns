# Adapter Design Pattern

## Overview

The Adapter Design Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible
interfaces, making them compatible without modifying their source code. This pattern is useful when integrating new
features or systems that have different interfaces.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/b98616d3-3a21-4c30-bafd-8415d7288fe8" alt="UML">
</p>

## Implementation Details

The structure:

1. `Target`: an interface that the client code expects, defining the desired interface for communication.

2. `Adaptee`: a class that has a different interface than what the client code expects.

3. `Adapter`: a class that implements the Target interface and wraps the Adaptee, making it compatible with the client
   code.

4. `Client`: a class that interacts with the Target interface.

The example consists of multiple classes and interfaces [🔗](./):

1. `Chargeable`: an interface that acts as a target and has charge method.

2. `Mobile & Laptop`: are classes that act as adaptees and have `chargeMobile` & `chargeLaptop` methods respectively.

3. `MobileCharger & LaptopCharger`: are classes that implement the `Chargeable` interface and wrap `Mobile` & `Laptop`
   classes respectively.

4. `Client`: a class that expects a class of type `Chargeable` in chargeDevice method.

## Usage

```java
MobileAdapter mobileAdapter = new MobileAdapter(new Mobile());
Client.chargeDevice(mobileAdapter);

LaptopAdapter laptopAdapter = new LaptopAdapter(new Laptop());
Client.chargeDevice(laptopAdapter);
```
