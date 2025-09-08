package Kabstracts;

public class Main {
public static void main(String[] args) {
    
}
}

abstract class Vehicle{
    abstract void drive();
    void start(){
        System.out.println("starting");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("driving...");
    }
}






/*
 *  Abstracts:
 *  - Abstract class cant be initialised. 
 *  - Declare the abstract keyword. 
 *  - Can include abstract or concrete methods. 
 *  - abstract methods have no body. - implmenation is in sub-classes. 
 *  - Blueprint for other classses to follow. Enables hierarchical design.
 * 
 *  - Define methods and properties common to all sub classes.
 *  - Can declare abstrct methods, force sub classes to implement.
 * 
 * - Imporves design:
 *      - enforces contracts of behaviour. 
 *      - ensures specific behaviour is implemented. 
 *      - Promote code resuse by making concrete methods.
 *      - Flexibility: defien behaviour toplevel - customize at lower levels. 
 * 
 * - problems with abstracts:
 *      - Doesnt encourage modularity
 *      - add code duplication.
 *      - with it comes maintainability/scalabilty.
 * 
 *   - problems with concrete classes:
 *      - Cant enforce behaviour.
 *      - instantiation is allowed but might not make sense. 
 *      - Tighter coupling. 
 * 
 * 
 * abstract class Animal{
    abstract void talk(); // abstract methods

    void eat(){
        System.out.println("animal eats"); // concrete method
    };

}
 * examples:
 * 
 * abstract class Shape{
    abstract double calcArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calcArea(){
        return Math.PI * radius * radius;
    }
}


 * abstract class Shape{
    abstract double calcArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calcArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }


    @Override
    double calcArea(){
       return width * height;
    }
}
 * 
 *                        abstracts                    interfaces
 *  instantiation:           no                            no
 *  constructors:            yes                           no
 *  fields:                  yes(with access control)  just constants 
 *  Methods:                abstract/concrete           abstract/concrete
 *  inheritance:            only extend once            implements many 
 */
// interface like pulbic static final class

/* advanced:
 *  - return types:
 *          primitives - no variance allowed.
 *          references - can return a subtype of the original.
 * 
 *  override rules:
 *      - access can be more permisive (not less)
 *      - Checked Exceptions can narrow not broaden. (unchecked anything)
 *    
 *  Subclass can also be abstract but contracts need to paid eventually!!!
 *      
 * - the lack of a body in the abstract methods is why the class MUST be abstract:
 *      - its an incomplete class. 
 * 
 * 
 * 
 * 
 */