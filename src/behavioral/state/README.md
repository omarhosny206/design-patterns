# State Design Pattern

## Overview

The State Design Pattern allows an object to alter its behavior when its internal state changes. It enables an object to
change its class dynamically, making it appear as if the object's behavior is changing. This pattern is particularly
useful when an object transitions through different states and needs to adapt its behavior accordingly.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/1593250d-84a7-4a8d-937c-b56109de24d1" alt="UML">
</p>

## Implementation Details

The structure:

1. `Context`: Maintains a reference to the current state object.

2. `State`: Interface or abstract class representing a specific state.

3. `ConcreteState`: Class that implements the State interface, represents different states.

The example consists of multiple classes and interfaces: [🔗](./)

1. `PhoneContext`: The context class that maintains the current state and delegates operations to the state.

2. `PhoneState`: Interface representing a specific state.

3. `OnPhoneState & OffPhoneState`: ConcreteState classes implementing the PhoneState interface.

## Usage

```java
PhoneState onPhoneState = new OnPhoneState();
PhoneState offPhoneState = new OffPhoneState();

PhoneContext onPhoneContext = new PhoneContext(onPhoneState);
PhoneContext offPhoneContext = new PhoneContext(offPhoneState);

onPhoneContext.pressPowerButton();
offPhoneContext.pressPowerButton();
```

## Useful links
**What is the difference between Strategy design pattern and State design pattern?** [Strategy vs. State Design Pattern](https://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern)
