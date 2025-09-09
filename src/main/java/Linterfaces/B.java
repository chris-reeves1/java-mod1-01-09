package Linterfaces;

public interface B {
    default void show(){
        System.out.println("This is B's default");
    }
}
