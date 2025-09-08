package Jinheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {

    //implicit (upcasting)
    // reference determins behaviour
    //Animal mydog = new Dog();
    //mydog.testMethod(); // overridden methods always take presedense. 
    // List<Animal> animals = new ArrayList<>();
    // animals.add(new Dog());
    // for (Animal animal : animals){
    //     animal.speak();
    // }

    // Animal[] animals = new Dog[2];
    // animals[0] = new Dog();
    // animals[1] = new Animal();

    // explcit casting (downcasting)
    // Animal animal = new Dog(); //implicit upcastng
    // Dog mydog = (Dog) animal; // explicit - just an extra ref to the type. 

    // System.out.println(animal instanceof Dog);
}
}

class Animal {
    public void speak(){
        System.out.println("Animal is speaking...");
    }
}

class Dog extends Animal {
    @Override
     public void speak(){
         System.out.println("Dog is speaking...");}
    public void testMethod(){
        System.out.println("will this be accessible???");
    }
}






/*
 *  Inheritance:
 *      syntax:
 * 
 *          class SuperClass {
 *              // attributes, constructors, methods
 *          }
 * 
 *          class SubClass extends Superclass {
 *              // additional fields, methods, constructors.  
 *             } 
 * 
 *     
 *  Note: Final classes cannot be extended. 
 *        Final methods cannot be overridden.
 * 
 *  rules:
 *      - classes can only extend once
 *      - automatically inherit all methods and attributes of the superClass.
 *      - Constuctors not inherited but must be called by super().
 *      - Prefer composition "has-a" rather than "is-a". 
 *      - Prefer shallow inheritance - no deep chains.
 *      - ToString for each class. 
 *      
 *  Note: all class extend Object class - gives them equals() hashcode(), toString().
 * 
 *  What can a subclass do?
 *  - inherit methods + attributes
 *  - Access to fields and methods is subject to modifiers. 
 *  - Use methods as-is or override.
 *  - Overide methods:
 *          - @override annotation - ensures we are correctly changing the super method.
 *  -  super - use parent class method explicitly. 
 *  - call super() constructor. 
 *  - Add attributes. and methods. 
 * 
 * basic example: 
 * 
 * Dog dog = new Dog();

    dog.name = "buddy";
    dog.bark();
    dog.eat();
}
}

class Animal{
    protected String name;

    public void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println(name + " barks");
    }
}
 * 
 * 
 * Override example:
 * 
 * Car car = new Car();
    car.speed = 100;
    car.displaySpeed();
    car.displaySuperSpeed();
}
}

class Vehicle {
    protected int speed;

    public void displaySpeed(){
        System.out.println("speed: " + speed);
    }
}

class Car extends Vehicle {
    @Override
    public void displaySpeed(){
        System.out.println("cars speed: " + speed);
    }

    public void displaySuperSpeed(){
        super.displaySpeed(); // still access the super class method
    }
}
 * 
 * 
 * Fields:
 *  - inherited fields:
 *      - Inherit everthing that isnt private.
 *      - Access will depend on methods. 
 *  public: accessible everywhere
 *  protected: package-wide + other sub-classes
 *  default: package only
 *  private:    not directly accible.
 * 
 *  - Shadowing - using the same names for fields between super and sub classes.
 *                super.attr_name needed explicitly. 
 * 
 *  Constructoers:
 *  - not inherited
 *  - need to call with super()
 *  - first arg in constructor chain - should be with this() or super().
 *  - If not explicitly called the default super constructor is called - usees defualts.
 * 
 * eg:
 * 
 * Dog dog = new Dog("j");
    dog.displayName();
}
}


class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    int age;

    public Dog(String name){
        this(name, 1);
    }

    public Dog(String name, int age){
        super(name);
        this.age = age;
    }




    public void displayName(){
        System.out.println(name);
    }
}
 *  
 *  Substitution 
 *  - subtypes must be substitutable for there paretn type - without altering the 
 *      correct flow of or application. True polymorphism. 
 * 
 * - flexibility - adaptable to future changes.
 * - Reusability: - write generic code that works for all classes.
 * - abstraction. 
 * 
 *  - List<Animal> animals = new ArrayList<>();
    animals.add(new Dog());
    for (Animal animal : animals){
        animal.speak();
    }
}
}

class Animal {
    public void speak(){
        System.out.println("Animal is speaking...");
    }
}

class Dog extends Animal {
    @Override
     public void speak(){
         System.out.println("Dog is speaking...");}
    public void testMethod(){
        System.out.println("will this be accessible???");
    }
}


Animal[] animals = new Dog[2];
    animals[0] = new Dog();
    animals[1] = new Animal();

 */