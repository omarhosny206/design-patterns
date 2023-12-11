# Bridge Design Pattern

## Overview

The Bridge Design Pattern is a structural pattern that separates abstraction from implementation, allowing both to
evolve independently. It involves creating a bridge interface that acts as a bridge between two independent hierarchies,
making it possible for them to vary independently without affecting each other. This pattern is particularly useful when
you want to avoid a permanent binding between an abstraction and its implementation.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/46b0e118-de43-42bb-b576-09271068f6c1" alt="UML">
</p>

## Implementation Details

The structure:

1. `Abstraction`: an abstract class that defines the high-level abstraction and holds a reference to the implementation.

2. `RefinedAbstraction`: a refined abstraction class that extends the abstraction and provides specific implementations.

3. `Implementor`: an interface that defines the low-level operations.

4. `ConcreteImplementorA & ConcreteImplementorB`: classes that implement the `Implementor` interface.

The example consists of multiple classes and interfaces: [🔗](./)

1. `Shape`: an abstract class that represents the high-level abstraction of shapes and holds a reference to the `Color`
   implementation.

2. `Square & Triangle`: refined abstraction classes that extend the `Shape` and provide specific implementations.

3. `Color`: an interface that represents the low-level operation of filling a shape with color. it is also called
   the `Bridge` interface.

4. `Green & Red`: classes that implement the `Color` interface.

## Usage

```java
Shape square = new Square(new Red());
Shape triangle = new Triangle(new Green());

square.draw();
triangle.draw();
```