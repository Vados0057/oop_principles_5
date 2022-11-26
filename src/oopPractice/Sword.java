package oopPractice;

import java.sql.SQLOutput;

public class Sword {

    //1.Contractor
    //Modified constructor
    public Sword(String material){
        this.material = material;
    }

    //Modified constructor
    public Sword(double weight, double length, String name, String material){
        this.weight = weight;
        this.length = length;
        this.name = name;
        this.material = material;
    }

    //2. Instance Variables

    //static              ->     means that this one will be belonged to the class.   What does any sword has?
    public static final boolean hasHandle = true;
    public static boolean isSharp;

    //non-static          ->     means that belongs to the object.   What is changing sword by sword?
    public double weight;
    public double length;
    public String name;
    public String material;

    //3. Methods      ->    What does a sword do?

    // static
    public static void slash(){
        System.out.println("Sword is slashing");
    }
    public static void damage(){
        if(isSharp) {
            System.out.println("Sward damages more");
        }else System.out.println("Sward damages less");
    }

    //non-static
    //weight * length = 2 pounds * 10 inches = 20 points
    //weight * length = 10 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points");
    }

    //running once before everything
    static{
        System.out.println("Starting the sword making furnace");
    }
    //running everytime when you create object before everything after static code block
    {
        System.out.println("Heating up the furnace");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
