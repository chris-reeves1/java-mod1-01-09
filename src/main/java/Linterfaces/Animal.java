package Linterfaces;

public interface Animal {
    default void sleep(){
        System.out.println("sleeping..."); // concrete default - doent need to be implemented. 
    }
    void eat(); //must implement the abstract
}
