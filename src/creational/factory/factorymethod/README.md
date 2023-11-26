# Factory Method Design Pattern

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/c8b5443c-0663-4368-9ce7-245c8dde3c36" alt="UML">
</p>

## Implementation Details

The structure:

1. `Factory/Creator`: an interface that acts as a factory for the type we want to instantiate.

2. `ConcreteFactory1/ConcreteCreator1 ConcreteFactory2/ConcreteCreator2 ...`: are class that will be used to instantiate subclasses, each factory will be responsible for instantiating one subclass of type `Product` (e.g. `ConcreteProduct`).

3. `Product`: an interface or abstract class that will have subclasses.

4. `ConcreteProduct`: a class that extends/implements `Product` and will be instantiated by the `Factory`.


The example consists of multiple classes and interfaces: [🔗](./)

1. `PayloadParserFactory`: a class that acts as a factory with one method `getPayloadParser()` that instantiates a `PayloadParser` based on the implementation.

2. `JsonPayloadParserFactory & XmlPayloadParserFactory`: are class that act as factories with one method `getPayloadParser()` that instantiates a `JsonPayloadParser` & `XmlPayloadParser` respectively.

3. `PayloadParser`: an interface with `parse()` method.

4. `JsonPayloadParser & XmlPayloadParser`: are classes that implement the `PayloadParser` interface.

5. `FactoryClient`: a class with one static method `getPayloadParser(PayloadParserFactory payloadParserFactory)` that will instantiate a subclass of type `PayloadParser` based on the passed subclass of type `PayloadParserFactory`.

## Usage

```java
PayloadParser jsonPayloadParser = FactoryClient.getPayloadParser(new JsonPayloadParserFactory());
PayloadParser xmlPayloadParser = FactoryClient.getPayloadParser(new XmlPayloadParserFactory());
jsonPayloadParser.parse();
xmlPayloadParser.parse();
```
