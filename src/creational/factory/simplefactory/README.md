# Simple Factory Design Pattern

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/fe53eb0f-7f6e-4850-9377-09a3683d18a1" alt="UML">
</p>

## Implementation Details

The structure:

1. `Factory/Creator`: an interface that acts as a factory for the type we want to instantiate.

2. `ConcreteFactory/ConcreteCreator`: a class that will be used to instantiate subclasses of type `Product` (e.g. `ConcreteProduct`).

3. `Product`: an interface or abstract class that will have subclasses.

4. `ConcreteProduct`: a class that extends/implements `Product` and will be instantiated by the `Factory`.


The example consists of multiple classes and interfaces: [🔗](./)

1. `PayloadParserFactory`: a class that acts as a factory with one method `getPayloadParser(String payloadParserType)` that instantiates a `PayloadParser` based on `payloadParserType`.

2. `PayloadParser`: an interface with `parse()` method.

3. `JsonPayloadParser & XmlPayloadParser`: are classes that implement the `PayloadParser` interface.

## Usage

```java
PayloadParser jsonPayloadParser = PayloadParserFactory.getPayloadParser("JSON");
PayloadParser xmlPayloadParser = PayloadParserFactory.getPayloadParser("XML");
jsonPayloadParser.parse();
xmlPayloadParser.parse();
```
