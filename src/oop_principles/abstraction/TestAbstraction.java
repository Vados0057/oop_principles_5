package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        System.out.println("\n\t\tiPone\n");
        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        iPhone i2 = new iPhone(512, "iPhone 13", "Black", 1500.00);
        System.out.println(i2);


        System.out.println("\n\t\tSamsung\n");
        Samsung s1 = new Samsung();
        s1.call();
        s1.text();

        Samsung s2 = new Samsung(64, "Galaxy S 20", "Black", 700.00);
        System.out.println(s2);

    }
}
