package class_object;

public class AppleTest {
    public static void main(String[] args) {


        Apple apple1 = new Apple(); //after "new" word NEXT WORD called Constructor
        Apple apple2 = new Apple();
        // BEFORE BRINGING THE toString() method at the class:
        System.out.println(apple1); // it will return location
        System.out.println(apple2); // and they will be different

        //WE HAVE A DEFAULT VALUE IN CONSTRUCTOR, OBJECTS WILL HAVE A DEFAULT VALUE FOR ANY "CHARACTERISTIC"
        System.out.println("\nApple 1");
        System.out.println(apple1.color); // null
        System.out.println(apple1.taste); // null
        System.out.println(apple1.price); // 0.0

        System.out.println("\nApple 2");
        apple2.color = "Green"; // resigning the value
        apple2.price = 0.75;
        apple2.taste = "sour";
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste); // sour
        System.out.println(apple2.price); // 0.75

        System.out.println(apple1); // Apple{color='null', price=0.0, taste='null'}
        System.out.println(apple2); // Apple{color='Green', price=0.75, taste='sour'}
    }
}
