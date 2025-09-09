package Linterfaces;

public interface A {
    default void show(){
        System.out.println("This is A's default");
    }
}
