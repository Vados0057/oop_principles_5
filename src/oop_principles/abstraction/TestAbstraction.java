package oop_principles.abstraction;

import java.util.ArrayList;

public class TestAbstraction {
    public static void main(String[] args) {

        System.out.println("\n\t\tiPone\n");
        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        iPhone i2 = new iPhone(512, "iPhone 13", "Black", 1500.00);
        System.out.println(i2);
        i2.takesPhoto();
        i2.recordVideo();

        i2.connectToWiFi();

        System.out.println("\n\t\tSamsung\n");
        Samsung s1 = new Samsung();
        s1.call();
        s1.text();


        Samsung s2 = new Samsung(64, "Galaxy S 20", "Black", 700.00);
        System.out.println(s2);
        s2.takesPhoto();
        s2.recordVideo();

        s2.connectToWiFi();

        Nokia n1 = new Nokia();


    }
}
