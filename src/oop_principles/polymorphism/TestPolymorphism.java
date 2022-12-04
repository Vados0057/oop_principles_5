package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        System.out.println("\n\t*Cat*");
        Cat c1 = new Cat();
        c1.eat();
        c1.eat("Fish");
        c1.sleep();

        System.out.println("\n\t*Dog*");
        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();

        System.out.println("\n\t*Up-Casting polymorphism(Dynamic, implicitly)*\n");
        Animal a3 = new Dog();
        Animal a2 = new Cat();

        c1.meow();
        d1.bark();
        a2.eat();
        a3.sleep();

        System.out.println("\n\t*Down-Casting polymorphism(Explicitly)*\n");
       // Cat cat = (Cat) new Animal();// bad example of down-Casting ClassCastException
        Animal myDog = new Dog(); //up-casting
        Dog newDog = (Dog) myDog;
        newDog.bark();




    }
}
