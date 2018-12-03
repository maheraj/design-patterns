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
