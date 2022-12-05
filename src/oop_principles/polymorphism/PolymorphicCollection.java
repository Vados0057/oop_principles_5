package oop_principles.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class PolymorphicCollection {
    public static void main(String[] args) {

        System.out.println("\n\t*Animal object*\n");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("Food");
        animal1.sleep();

        System.out.println("\n\t*Cat Object*\n");
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.eat("Fish");
        cat1.sleep();
        cat1.meow();

        System.out.println("\n\t*Dog Object*\n");
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.eat("Meat");
        dog1.sleep();
        dog1.bark();

        System.out.println("\n\t* Cat object in the shape of Animal\n");
        Animal animal2 = new Cat();
        animal2.sleep();
        animal2.eat();
        animal2.eat("Fish");

        System.out.println("\n\t*Dog object in the shape of Animal\n");
        Animal animal3 = new Dog();
        animal3.eat();
        animal3.eat("Bone");
        animal3.sleep();

        System.out.println("\n\t*Store all above object in a array*\n");
        Animal[] animals = {animal1, animal2, animal3, cat1, dog1};
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
            a.eat();a.eat("str");a.sleep();
        }
        System.out.println();

        System.out.println("\n\t*Store all above object in a ArrayList*\n");
        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);

    }
}
