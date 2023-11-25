# Observer Design Pattern

## Overview

The Observer Design Pattern defines a one-to-many dependency between objects, ensuring that when one object (the
subject or publisher or observable) changes its state, all its dependents (observers or subscribers) are notified and
updated automatically. This pattern is
commonly used for implementing distributed event handling systems.

<p align="center">
    <img src="https://github.com/omarhosny206/design-patterns/assets/58389695/946a52f9-8735-4b47-9618-d4b8052de1e1" alt="UML">
</p>

## Implementation Details

The structure:

1. `Observer/Subscriber`: an interface declaring the update method to be implemented by concrete observers.

2. `Subject/Publisher/Observable`: an interface declaring methods to manage
   observers (`addObserver`, `removeObserver`, `notifyAllObservers`).

3. `ConcreteObserver/ConcreteSubscriber`: a class implementing the Observer interface, defining the specific behavior
   when notified.

4. `ConcreteSubject/ConcretePublisher/ConcreteObservable`: a class implementing the Subject interface, maintaining a
   list of observers `List<Observer>` and notifying them of
   state changes.

The example consists of multiple classes and interfaces: [🔗](./)

1. `Observer`: an interface with update method.

2. `Subject`: an interface with methods to manage observers (`addObserver`, `removeObserver`, `notifyAllObservers`).

3. `YoutubeSubscriber`: a class implementing the `Observer` interface, representing a subscriber to a YouTube channel.

4. `YoutubeChannel`: a class implementing the `Subject` interface, representing a YouTube channel that notifies its
   subscribers of new videos. It acts as a `Subject/Publisher/Observable`.

## Usage

```java
Observer omar = new YoutubeSubscriber("omar");
Observer ahmed = new YoutubeSubscriber("ahmed");
Observer mohamed = new YoutubeSubscriber("mohamed");

YoutubeChannel youtubeChannel = new YoutubeChannel("NeetCode");

youtubeChannel.addObserver(omar);
youtubeChannel.addObserver(ahmed);
youtubeChannel.addObserver(mohamed);

youtubeChannel.upload("How to reverse a linked list?");
```
