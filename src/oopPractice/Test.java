package oopPractice;

import java.lang.invoke.SwitchPoint;

public class Test {

    public static void main(String[] args) {


        System.out.println("\nSword1 is created after this line:\n");
        Sword sword1 = new Sword("Iron"); // default constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nWorking with the static values\n");
        System.out.println("hasHandle " + Sword.hasHandle);
        System.out.println("isSharp before " + Sword.isSharp);
        Sword.damage();


        Sword.isSharp = true;
        System.out.println("isSharp after " + Sword.isSharp);
        Sword.damage();

        System.out.println("\n Sword3 is created after this line:\n");
        Sword sword3 = new Sword(10, 25, "Super Long Sword", "TITANIUM"); // from modified constructor
        System.out.println("Printing out sword2 = " + sword3);


        System.out.println("\n Sword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15.0, "Long Sword", "iron"); // from modified constructor
        System.out.println("Printing out sword2 = " + sword2);

        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);


        Sword.isSharp = true;
        System.out.println(Sword.isSharp);

        Sword.slash();

        System.out.println("\n Working with non static method\n");

        sword1.harms();
        sword2.harms();
        sword3.harms();



    }
}
