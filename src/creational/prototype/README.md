# Prototype Design Pattern

## Overview

The Prototype Design Pattern simplifies object creation by copying an existing instance, known as the prototype, instead
of invoking constructors to create new objects. This pattern is valuable when copying is more efficient or less complex
than constructing new instances.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/7ddc017e-3c16-4bab-8439-91b962e22403" alt="UML">
</p>

## Implementation Details

The example consists of multiple classes and interfaces [[Path](./)]:

1. `Cloneable`: an interface that declares the clone method, serving as the foundation for objects that support
   cloning.

2. `Shape`: an interface that extends Cloneable and defines the draw method, ensuring that all shapes provide a common
   method
   for drawing.

3. `Circle`: a class that implements the Shape interface and includes a clone method to create a copy of a circle. It
   contains a radius attribute and methods for getting and setting the radius.

4. `Square`: a class also that implements the Shape interface, featuring a clone method for creating a copy of a square.
   It includes a side attribute with corresponding getter and setter methods.

5. `Client`: a class that acts as a facilitator for cloning objects. Its clone method accepts a Cloneable object and returns a
   cloned instance.
