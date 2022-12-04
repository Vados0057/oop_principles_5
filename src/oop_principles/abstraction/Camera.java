package oop_principles.abstraction;

public interface Camera {


    void takesPhoto();
    void recordVideo();
    String color = "Black";

    default void method1(){
        System.out.println("this is a default method");
    }

}
