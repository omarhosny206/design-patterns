# Composite Design Pattern

## Overview

The Composite Design Pattern is a structural pattern that lets you compose objects into tree structures to represent
part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly. This
pattern is particularly useful when you want to work with complex structures that consist of both individual objects and
compositions of objects.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/6e3ee976-e93d-4497-98f7-57ca6daa89b3" alt="UML">
</p>

## Implementation Details

The structure:

1. `Component`: This is the common interface for all components, defining the basic operations that individual objects
   and compositions of objects share.

2. `Leaf`: These are the individual objects that implement the `Component` interface. They represent the
   basic building blocks of the composition.

3. `Composite`: This class represents a composition of `Component`. It implements the `Component` interface and can
   contain a
   collection of `Component` objects, including other `Composite` instances as `Composite` is also a `Component`.

The example (01) consists of multiple classes and interfaces: [🔗](./example01)

1. `Shape`: an interface that represents the `Component` with `getInfo()` method.

2. `Circle & Rectangle`: are the leaf components that implement the `Shape` interface.

3. `Drawing`: a composite component that implements the `Shape` interface. It can contain a collection of `Shape` objects,
   allowing compositions of objects.

## Usage

```java
Shape circle = new Circle();
Shape rectangle = new Rectangle();
Drawing drawing1 = new Drawing("drawing1", List.of(circle, rectangle));
Drawing drawing2 = new Drawing("drawing2", List.of(drawing1, circle, circle));

System.out.println(drawing1.getInfo());
System.out.println(drawing2.getInfo());
```

The example (02) consists of multiple classes and interfaces: [🔗](./example02)

1. `FileSystemComponent`: an interface that represents the `Component` with `getInfo()` method.

2. `File`: is the leaf components that implement the `FileSystemComponent` interface.

3. `Directory`: a composite component that implements the `DirectoryComponent` interface that extends `FileSystemComponent` interface. It can contain a collection of `FileSystemComponent` objects,
   allowing compositions of objects.

## Usage

```java
FileSystemComponent todosFile = new File("todos.txt");
FileSystemComponent wordFile = new File("word.docx");
FileSystemComponent javaFile = new File("Main.java");
DirectoryComponent sideProjectDirectory = new Directory("side project");
DirectoryComponent developerDirectory = new Directory("developer", List.of(todosFile, wordFile, javaFile, sideProjectDirectory));

FileSystemComponent bashConfigFile = new File(".bashrc");
FileSystemComponent zshConfigFile = new File(".zshrc");
DirectoryComponent ubuntuDirectory = new Directory("ubuntu", List.of(developerDirectory));
FileSystemComponent rootDirectory = new Directory("root", List.of(bashConfigFile, zshConfigFile, ubuntuDirectory));

System.out.println(rootDirectory.getInfo());
```