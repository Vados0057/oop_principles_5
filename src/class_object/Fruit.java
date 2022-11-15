package class_object;

public class Fruit {

    public static int numberOfFruits = 0;
    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;

    // Instance block is executed for each object being created
    {
        System.out.println("A new object of Fruit is created");
        numberOfFruits++;
        System.out.println("So far, you created " + numberOfFruits + " Fruit objects");
    }

    // Static block is execute only once and before everything else in the same class
    static {
        //connect to file here and read data
        hasColor = true;
        System.out.println("This is a static block");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
    }

}