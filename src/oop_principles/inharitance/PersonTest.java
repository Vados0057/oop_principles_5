package oop_principles.inharitance;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Tester t1 = new Tester();

        p1.eat();//Person eats
        t1.eat();//Person eats
        //after overriding this method we will have a  Tester eats.

        p1.sleep();// Person sleeps
        t1.sleep();// Tester sleeps

        System.out.println(p1);
        System.out.println(t1);

    }
}
