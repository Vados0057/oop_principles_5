package class_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {


        // Scanner input = new Scanner(System.in);
        //        System.out.println("Please enter a Color:");
//        car1.color = input.nextLine();
//        System.out.println("Please enter a Make:");
//        car1.make = input.nextLine();
//        System.out.println("Please enter a Model:");
//        car1.model = input.nextLine();
//        System.out.println("Please enter a Year:");
//        car1.year = input.nextInt();
//        System.out.println("Please enter a Price:");
//        car1.price = input.nextDouble();


        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        System.out.println("\n\t\t\t PRINT EACH CAR\n");
        cars.forEach(System.out::println);

        System.out.println("\n\t\tFind Most expensive car and chipset car\n");
        Car mostExpensiveCar = cars.get(0);
        Car cheapestCar = cars.get(0);
        int blackCars = 0;
        for (Car car : cars) {
            if (car.price > mostExpensiveCar.price) mostExpensiveCar = car;
            if (car.color.equals("Black")) {
                blackCars++;
            }
            for (Car c : cars) {
                if (c.price < cheapestCar.price) cheapestCar = c;
            }
        }
        System.out.println("Most expensive car is: " + mostExpensiveCar);
        System.out.println("There is " + blackCars + " black cars in ArrayList");
        System.out.println("Cheapest car is: "  + cheapestCar);


    }
}
