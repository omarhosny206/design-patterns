# Memento Design Pattern

## Overview

The Memento Design Pattern is a behavioral pattern that provides the ability to restore an object to its previous state.
It allows capturing and externalizing an object's internal state so that the object can be restored to this state later.
This pattern is particularly useful for implementing undo mechanisms in applications.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/b4aaa11f-a285-4c8f-9687-cda30fcae5b2" alt="UML">
</p>

## Implementation Details

The structure:

1. `Originator`: The object whose state needs to be saved.

2. `Memento`: The object that stores the state of the originator.

3. `Caretaker`: The object that keeps track of multiple mementos.


The example consists of multiple classes: [🔗](./)

1. `Editor`: a class with a state that needs to be saved.

2. `EditorState`: a class that represents the state of the `Editor` at a particular point in time.

3. `EditorHistory`: a class that manages the history of the editor's content by storing a collection of `Momento` or `EditorState` in our case.

## Usage

```java
Editor editor = new Editor();
EditorHistory editorHistory = new EditorHistory();

editorHistory.save(editor.save("First line"));
editorHistory.save(editor.save("Second line"));
editorHistory.save(editor.save("Third line"));

System.out.println(editor.getContent());

editor.restore(editorHistory.undo());
System.out.println(editor.getContent());
editor.restore(editorHistory.undo());
System.out.println(editor.getContent());
```
