# Abstract Factory Design Pattern

## Overview

The Abstract Factory Design Pattern is a creational pattern that provides an interface for creating families of related
or dependent objects without specifying their concrete classes. It allows a system to be independent of how its objects
are created, composed, and represented, and promotes loose coupling, flexibility, and extensibility in your code.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/a0f19311-4182-4bd3-9592-96e5d6f7e8ea" alt="UML">
</p>

## Implementation Details

The structure:

1. `AbstractFactory`: an interface that acts as a factory for the family of related types we want to instantiate.

2. `ConcreteFactory1 ConcreteFactory2 ...`: are class that will be used to instantiate
   subclasses, each factory will be responsible for instantiating subclasses objects from a specific family of
   type `Product/Abstract Product`

3. `Product`: an interface or abstract class that will have subclasses.

4. `ConcreteProduct`: a class that extends/implements `Product` and will be instantiated by the `Factory`.

The example consists of multiple classes and interfaces: [🔗](./)

1. `PayloadAbstractFactory`: an interface that acts as a factory having two
   methods `getPayloadParser` & `getPayloadValidator` for instantiating a family of related objects of
   types `PayloadParser` & `PayloadValidator`.

2. `JsonPayloadFactory & XmlPayloadFactory`: are class that act as factories with two
   methods `getPayloadParser()` & `getPayloadValidtor()`. They are used to
   instantiate a family of related
   objects `JsonPayloadParser & JsonPayloadValidator` & `XmlPayloadParser & XmlPayloadValidator` respectively.

3. `PayloadParser`: an interface with `parse()` method.

4. `PayloadValidator`: an interface with `validate()` method.

5. `JsonPayloadParser & XmlPayloadParser`: are classes that implement the `PayloadParser` interface.

6. `JsonPayloadValidator & XmlPayloadValidator`: are classes that implement the `PayloadValidator` interface.

7. `PayloadFactoryClient`: a class with two static
   method `getPayloadParser(PayloadAbstractFactory payloadParserAbstractFactory)` & `getPayloadValidator(PayloadAbstractFactory payloadParserAbstractFactory)`
   that
   will instantiate subclasses of related objects of type `PayloadParser` & `PayloadValidator` based on the passed
   subclass of type `PayloadAbstractFactory`.

## Usage

```java
PayloadAbstractFactory jsonPayloadFactory = new JsonPayloadFactory();
PayloadAbstractFactory xmlPayloadFactory = new XmlPayloadFactory();

PayloadParser jsonPayloadParser = PayloadFactoryClient.getPayloadParser(jsonPayloadFactory);
PayloadValidator jsonPayloadValidator = PayloadFactoryClient.getPayloadValidator(jsonPayloadFactory);

PayloadParser xmlPayloadParser = PayloadFactoryClient.getPayloadParser(xmlPayloadFactory);
PayloadValidator xmlPayloadValidator = PayloadFactoryClient.getPayloadValidator(xmlPayloadFactory);

jsonPayloadParser.parse();
jsonPayloadValidator.validate();

xmlPayloadParser.parse();
xmlPayloadValidator.validate();
```
