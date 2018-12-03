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

## Decorator - Behavioral Design Pattern
In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. The Decorator [3] design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

```
//Abstract Pizza class (All classes extend from this
abstract class Pizza {
  String description = "Unknown Pizza";
  public String getDescription() {
    return description;
  }
  public abstract int getCost();
}

//The decorator class :  It extends Pizza to be interchangable with it topings decorator can also be implemented as an interface 

abstract class ToppingsDecorator extends Pizza {
  public abstract String getDescription();
}

// Concrete pizza classes 
class PeppyPaneer extends Pizza {
  public PeppyPaneer() {description = "PeppyPaneer"}
  public String getDescription() {return pizza.getDescription;}
  public int getCost() {return 100;}
}

class FarmHouse extends Pizza {
  public FarmHouse() {description = "FarmHouse"}
  public String getDescription() {return pizza.getDescription;}
  public int getCost() {return 100;}
}

class Margherita extends Pizza {
  public Margherita() {description = "Margherita"}
  public String getDescription() {return pizza.getDescription;}
  public int getCost() {return 100;}
}

class ChickenFiesta extends Pizza {
  public ChickenFiesta() {description = "ChickenFiesta"}
  public String getDescription() {return pizza.getDescription;}
  public int getCost() {return 100;}
}

class SimplePizza extends Pizza {
  public SimplePizza() {description = "SimplePizza"}
  public String getDescription() {return pizza.getDescription;}
  public int getCost() {return 100;}
}

// Concrete toppings classes 
class FreshTomato extends ToppingsDecorator {
  public FreshTomato(Pizza pizza) {
    this.pizza = pizza;
  }
  
  public String getDescription() {
    return pizza.getDescription + ", Fresh Tomato ";
  }
  public int getCost() {
    return 40 + pizza.getCost();
  }
}


class Barbeque extends ToppingsDecorator {
  public Barbeque(Pizza pizza) {
    this.pizza = pizza;
  }
  
  public String getDescription() {
    return pizza.getDescription + ", Barbeque ";
  }
  public int getCost() {
    return 60 + pizza.getCost();
  }
}

class Paneer extends ToppingsDecorator {
  public Paneer(Pizza pizza) {
    this.pizza = pizza;
  }
  
  public String getDescription() {
    return pizza.getDescription + ", Paneer ";
  }
  public int getCost() {
    return 30 + pizza.getCost();
  }
}

class PizzaStore 
{ 
    public static void main(String args[]) 
    { 
        // create new margherita pizza 
        Pizza pizza = new Margherita(); 
        System.out.println( pizza.getDescription() + 
                         " Cost :" + pizza.getCost()); 
  
        // create new FarmHouse pizza 
        Pizza pizza2 = new FarmHouse(); 
  
        // decorate it with freshtomato topping 
        pizza2 = new FreshTomato(pizza2); 
  
        //decorate it with paneer topping 
        pizza2 = new Paneer(pizza2); 
  
        System.out.println( pizza2.getDescription() + 
                         " Cost :" + pizza2.getCost()); 
        Pizza pizza3 = new Barbeque(null);    //no specific pizza 
        System.out.println( pizza3.getDescription() + "  Cost :" + pizza3.getCost()); 
   } 
} 
```
## Strategy Pattern
In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use

```
// Java program to demonstrate implementation of 
// Strategy Pattern 

// Abstract as you must have a specific fighter 
abstract class Fighter 
{ 
	KickBehavior kickBehavior; 
	JumpBehavior jumpBehavior; 

	public Fighter(KickBehavior kickBehavior, 
				JumpBehavior jumpBehavior) 
	{ 
		this.jumpBehavior = jumpBehavior; 
		this.kickBehavior = kickBehavior; 
	} 
	public void punch() 
	{ 
		System.out.println("Default Punch"); 
	} 
	public void kick() 
	{ 
		// delegate to kick behavior 
		kickBehavior.kick(); 
	} 
	public void jump() 
	{ 

		// delegate to jump behavior 
		jumpBehavior.jump(); 
	} 
	public void roll() 
	{ 
		System.out.println("Default Roll"); 
	} 
	public void setKickBehavior(KickBehavior kickBehavior) 
	{ 
		this.kickBehavior = kickBehavior; 
	} 
	public void setJumpBehavior(JumpBehavior jumpBehavior) 
	{ 
		this.jumpBehavior = jumpBehavior; 
	} 
	public abstract void display(); 
} 

// Encapsulated kick behaviors 
interface KickBehavior 
{ 
	public void kick(); 
} 
class LightningKick implements KickBehavior 
{ 
	public void kick() 
	{ 
		System.out.println("Lightning Kick"); 
	} 
} 
class TornadoKick implements KickBehavior 
{ 
	public void kick() 
	{ 
		System.out.println("Tornado Kick"); 
	} 
} 

// Encapsulated jump behaviors 
interface JumpBehavior 
{ 
	public void jump(); 
} 
class ShortJump implements JumpBehavior 
{ 
	public void jump() 
	{ 
		System.out.println("Short Jump"); 
	} 
} 
class LongJump implements JumpBehavior 
{ 
	public void jump() 
	{ 
		System.out.println("Long Jump"); 
	} 
} 

// Characters 
class Ryu extends Fighter 
{ 
	public Ryu(KickBehavior kickBehavior, 
			JumpBehavior jumpBehavior) 
	{ 
		super(kickBehavior,jumpBehavior); 
	} 
	public void display() 
	{ 
		System.out.println("Ryu"); 
	} 
} 
class Ken extends Fighter 
{ 
	public Ken(KickBehavior kickBehavior, 
			JumpBehavior jumpBehavior) 
	{ 
		super(kickBehavior,jumpBehavior); 
	} 
	public void display() 
	{ 
		System.out.println("Ken"); 
	} 
} 
class ChunLi extends Fighter 
{ 
	public ChunLi(KickBehavior kickBehavior, 
				JumpBehavior jumpBehavior) 
	{ 
		super(kickBehavior,jumpBehavior); 
	} 
	public void display() 
	{ 
		System.out.println("ChunLi"); 
	} 
} 

// Driver class 
class StreetFighter 
{ 
	public static void main(String args[]) 
	{ 
		// let us make some behaviors first 
		JumpBehavior shortJump = new ShortJump(); 
		JumpBehavior LongJump = new LongJump(); 
		KickBehavior tornadoKick = new TornadoKick(); 

		// Make a fighter with desired behaviors 
		Fighter ken = new Ken(tornadoKick,shortJump); 
		ken.display(); 

		// Test behaviors 
		ken.punch(); 
		ken.kick(); 
		ken.jump(); 

		// Change behavior dynamically (algorithms are 
		// interchangeable) 
		ken.setJumpBehavior(LongJump); 
		ken.jump(); 
	} 
} 

```

## Adapter pattern - Behavioral Design pattern
The adapter pattern convert the interface of a class into another interface clients expect

* The client makes a request to the adapter by calling a method on it using the target interface.
* The adapter translates that request on the adaptee using the adaptee interface
* Client receive the results of the call and is unaware of adapter’s presence.

```
// Java implementation of Adapter pattern 

interface Bird 
{ 
	// birds implement Bird interface that allows 
	// them to fly and make sounds adaptee interface 
	public void fly(); 
	public void makeSound(); 
} 

class Sparrow implements Bird 
{ 
	// a concrete implementation of bird 
	public void fly() 
	{ 
		System.out.println("Flying"); 
	} 
	public void makeSound() 
	{ 
		System.out.println("Chirp Chirp"); 
	} 
} 

interface ToyDuck 
{ 
	// target interface 
	// toyducks dont fly they just make 
	// squeaking sound 
	public void squeak(); 
} 

class PlasticToyDuck implements ToyDuck 
{ 
	public void squeak() 
	{ 
		System.out.println("Squeak"); 
	} 
} 

class BirdAdapter implements ToyDuck 
{ 
	// You need to implement the interface your 
	// client expects to use. 
	Bird bird; 
	public BirdAdapter(Bird bird) 
	{ 
		// we need reference to the object we 
		// are adapting 
		this.bird = bird; 
	} 

	public void squeak() 
	{ 
		// translate the methods appropriately 
		bird.makeSound(); 
	} 
} 

class Main 
{ 
	public static void main(String args[]) 
	{ 
		Sparrow sparrow = new Sparrow(); 
		ToyDuck toyDuck = new PlasticToyDuck(); 

		// Wrap a bird in a birdAdapter so that it 
		// behaves like toy duck 
		ToyDuck birdAdapter = new BirdAdapter(sparrow); 

		System.out.println("Sparrow..."); 
		sparrow.fly(); 
		sparrow.makeSound(); 

		System.out.println("ToyDuck..."); 
		toyDuck.squeak(); 

		// toy duck behaving like a bird 
		System.out.println("BirdAdapter..."); 
		birdAdapter.squeak(); 
	} 
} 

```
