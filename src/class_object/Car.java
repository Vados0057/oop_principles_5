package class_object;

public class Car {

    //default constructor
    public Car(){}

    //Intstance variables

    public String color;
    public String make;
    public String model;
    public int year;
    double price;

    //  OVERLOADING CONSTRUCTOR 5 local args
    public Car(String color, String make, String model, int year, double price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
