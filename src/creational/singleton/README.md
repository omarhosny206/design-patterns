# Singleton Design Pattern

## Overview

The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to it.
There are multiple implementations of the Singleton Design Pattern: Eager, Lazy, Thread-Safe and Double-Checked
Locking.


<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/5aff2c83-3e72-4825-a649-b9fb69bd9346" alt="UML">
</p>

## Implementation Details

Let's give an example of `DatabaseConnection` class.

### 1. Eager Singleton [[Path](./eagerinitialization)]

In the Eager Singleton implementation, the instance of `DatabaseConnection` is created at the time of class loading.
This ensures that the instance is always available and is thread-safe by
default.

### 2. Lazy Singleton [[Path](./lazyinitialization)]

The Lazy Singleton implementation creates the instance of `DatabaseConnection` only when needed. This can be more
efficient in terms of resource utilization, especially if the instance is not always required.

### 3. Thread-Safe Singleton [[Path](./threadsafe)]

The Thread-Safe Singleton implementation ensures that the instance creation is thread-safe, preventing multiple threads
from creating multiple instances simultaneously.

### 4. Double-Checked Locking Singleton [[Path](./doublecheckedlocking)]

The Double-Checked Locking Singleton improves the Thread-Safe Singleton. It trims synchronization overhead by confirming
the instance both inside and outside the synchronized block.

## Usage
```java
DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
```