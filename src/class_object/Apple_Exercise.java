package class_object;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple_Exercise {
    public static void main(String[] args) {

                    /*
            Create 3 Apple objects with below info

            apple1
            Red
            0.5
            Sweet

            apple2
            Yellow
            0.75
            Sweet

            apple3
            Green
            1.0
            Sour

            Print all the objects
             */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        System.out.println("\nApple 1");
        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";
        System.out.println(apple1);

        System.out.println("\nApple 2");
        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";
        System.out.println(apple2);

        System.out.println("\nApple 3");
        apple3.color = "Green";
        apple3.price = 1;
        apple3.taste = "Sour";
        System.out.println(apple3);

        System.out.println("\n Apple exercise\n");

        int sweetCount = 0;
        Apple[] apples = {apple1, apple2, apple3};

//        System.out.println(Arrays.toString(apples));
//        System.out.println(apples.length);
//        System.out.println(apples[1]);
//        System.out.println(apples[2].taste);

        for (Apple apple : apples) {
            if (apple.taste.equals("Sweet")) sweetCount++;
        }
        System.out.println("There is " + sweetCount +  " Sweet apples");
    }
}