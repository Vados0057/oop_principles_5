package oop_principles.abstraction;

public interface Camera {


    void takesPhoto();
    void recordVideo();

    default void method1(){
        System.out.println("this is a default method");
    }

}
