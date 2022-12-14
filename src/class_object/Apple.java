package class_object;

public class Apple {

  // default constructor is provided by Java to create a zero arg object

    public Apple(){    // it was already inside the class
        // Each time you created a new object this block will be executed

    }
    //  OVERLOADING CONSTRUCTOR WITH 3 ARGS


    public Apple(String color, double price, String taste) {
        this.color = color;
        this.price = price;
        this.taste = taste;
    }

    //instance variables - fields - states - attributes
    public String color; // each object "Apple" will have a color
    //default value is null
    public double price; // each object "Apple" will have a price
    //default value is 0.0
    public String taste; // each object "Apple' will have a taste
    //default value is null


    @Override
    public String toString() { //   THIS METHOD WILL GIVE YOU THE VALUE OF THE OBJECT INSTEAD OF LOCATION
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}