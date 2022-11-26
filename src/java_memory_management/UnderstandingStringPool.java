package java_memory_management;

import class_object.Car;

public class UnderstandingStringPool {

    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        String name6 = new String("John");

        //name1, name2, name3, name4, name6 having value of the "JOHN

        System.out.println(name1 == name3); // true    -> it compare  location and its same

        System.out.println(name6 == name1); // false    -> not the same location

        System.out.println(name6.equals(name1));  // true    -> comparing value not location

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1 == car2); //false
        System.out.println(car1.equals(car2)); // false
    }


}
