# Software Design Patterns
Design patterns are used to represent some of the best practices adapted by experienced object-oriented software developers.

## Types of Design Patterns
There are mainly three types of design patterns:
* Creational
* Structural
* Behavioral

### Creational
These design patterns are all about class instantiation or object creation. Two types:
* Class creational patterns - While class-creation patterns use inheritance effectively in the instantiation process
* Object creational patterns - use delegation effectively to get the job done

### Structural
These design patterns are about organizing different classes and objects to form larger structures and provide new functionality. They are:
* Adapter
* Bridge
* Composite
* Decorator
* Facade
* Flyweight
* Private Class Data and 
* Proxy

### Behavioral
Behavioral patterns are about identifying common communication patterns between objects and realize these pattern. Behavioral patterns are:
* Chain of responsibility
* Command
* Interpreter
* Iterator
* Mediator
* Memento
* Null Object
* Observer
* State
* Strategy
* Template method
* Visitor

## Creational Design Patterns
These design patterns are all about class instantiation or object creation. Two types:
### Factory Method - Creational - Object Creation
Factory method is a creational design pattern, i.e., related to object creation. In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.
* Creational - Object Creation.
* Hide object creation logic to client.
* The idea is to use a static member-function (static factory method) which creates & returns instances, hiding the details of class modules from user.
* A factory pattern is one of the core design principles to create an object
```
abstract class Vehicle {}
class TwoWheeler extends Vehicle {}
class FourWheeler extends Vehicle {}
public class VehicleFactory {
  public static Vehicle getVehicle(int type) {
    if(type == 1) {
      return new TwoWheeler();
    } else if (type == 2) {
      return new FourWheeler();
    } else {
      return null;
    }
  }
}

```

## Observer - Behavioral Design Pattern
The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically. Ex: subscribe to a magazine. Subscrive to a youtube channel.
* One to many dependency is between Subject(One) and Observer(Many)
* There is dependency as Observers themselves don’t have access to data. They are dependent on Subject to provide them data.
* Disadvantage - Lapsed listener problem

**When to use this pattern?**
You should consider using this pattern in your application when multiple objects are dependent on the state of one object as it provides a neat and well tested design for the same.
```
interface Subject {
  List<Observer> observers;
  
  void registerObserver(Observer observer);
  void unregisterObserver(Observer observer);
  void notifyObservers();
}

interface Observer {
  void notify();
}

class Magazine implements Subject {

}

class User implements Observer {

}
```

## Singleton - Creational Pattern
The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. 

Singleton is a part of Gang of Four design pattern and it is categorized under creational design patterns. Initialization Types of singleton:
* Early initialization
* Lazy initialization

Example of Singleton Class:
* Runtime - java .lang.Runtime;

```
class Singleton {
  private volatile static Singleton obj;
  private Singleton() {}
  public static Singleton getInstance() {
    if(obj == null) {
      synchronized (Singleton.class) {
        if(obj == null) {
          obj = new Singleton();
        }
      }
    }
    return obj;
  }
}
```
