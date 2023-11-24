# Builder Design Pattern

## Overview

The Builder Design Pattern is a creational design pattern that separates the construction of a complex object from its
representation, allowing the same construction process to create various representations. This pattern is particularly
useful when dealing with objects that have a complex construction process with many optional components.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/9b52fabf-a80b-4184-ac53-4461c4bdfe3d" alt="UML">
</p>

## Implementation Details

Let's give an example of `Computer` class.

The example consists of two classes [[Path](Computer.java)]:

1. `Computer`: The main class representing the computer with optional components. It has a private constructor and a
   static nested builder class.

2. `ComputerBuilder`: The builder class responsible for constructing a `Computer` object with optional parameters. It
   includes default values for each component and allows users to set specific configurations using a fluent interface.

## Usage

```java
Computer computer = Computer.builder()
        .processor("M3 Max")
        .ram("32 gb")
        .diskStorage("512 gb")
        .monitorSizeInches("16 inches")
        .build();
```