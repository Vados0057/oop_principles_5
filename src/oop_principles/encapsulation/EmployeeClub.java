package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeClub {
    public static void main(String[] args) {

        Company company1 = new Company("Microsoft", "Washington", "(000) 123-1234");
        Company company2 = new Company("Apple", "California", "(000) 000-0000");

        Employee emp1 = new Employee("John Doe", "Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith", "Developer", 40, company2);
        Employee emp3 = new Employee("Jane Doe", "Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith", "Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold", "Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan", "Developer", 40, company1);

        /*
        # employees for Apple -> 2
        # employees for Microsoft -> 4
        # managers -> 1
        # developers -> 3
        # testers -> 2
        # developers work in Microsoft -> 2

        Find the youngest developer -> Jane is the youngest with age = 20
        Find the oldest employee -> John is the oldest with the age = 45
         */

        Employee[] employees = {emp1,emp2,emp3,emp4,emp5,emp6};

        System.out.println("\n----------------COUNT APPLE AND MICROSOFT EMPLOYEE MEMBER -----------------\n");
        int totalAppleEmployee = 0;
        for (Employee employee : employees) {
            if (employee.getCompany().getName().equals("Apple")) totalAppleEmployee++;
        }

        System.out.println("Total Microsoft employee = " + Arrays.stream(employees).filter(e ->
                e.getCompany().getName().equals("Microsoft")).count());
        System.out.println("Total Apple employee = " + totalAppleEmployee);



        System.out.println();

        System.out.println("\n--------------COUNT DEVELOPERS-------------\n");
        int developersCount = 0;
        int managersCount = 0;
        int testerCount = 0;
        int devsInMicrosoft = 0;
        for (Employee employee : employees) {
            if (employee.getJobPosition().equals("Developer")) {
                developersCount++;
            }
            if (employee.getJobPosition().equals("Manager")) {
                managersCount++;
            }
            if (employee.getJobPosition().equals("Tester")){
                testerCount++;
            }if (employee.getCompany().equals(company1) && employee.getJobPosition().equals("Developer")){
                devsInMicrosoft++;
            }
        }
        System.out.println("Total developers = " + developersCount);
        System.out.println("Total managers = " + managersCount);
        System.out.println("Total testers = " + testerCount);
        System.out.println("Total developers in Microsoft = " + devsInMicrosoft);


//        Employee oldestMicrosoftDev = new Employee();
//        for (Employee employee : employees) {
//            if (employee.getCompany().equals(company1)
//             && employee.getJobPosition().equals("Developer") && employee.getAge() > oldestMicrosoftDev.getAge())
//                oldestMicrosoftDev = employee;
//        }
//        System.out.println(oldestMicrosoftDev.getFullName().split(" ")[0] +
//                " is the oldest Developer in the " + company1.getName() +
//                " with the age of " + oldestMicrosoftDev.getAge());

        Employee oldestMicrosoftDev = Arrays.stream(employees).filter(
                e -> e.getCompany().getName().equals("Microsoft") &&
                e.getJobPosition().equals("Developer")).max(
                        Comparator.comparingInt(Employee::getAge)).get();


        System.out.println(oldestMicrosoftDev.getFullName().split(" ")[0] +
                " is the oldest Developer in the " + company1.getName() +
                " with the age of " + oldestMicrosoftDev.getAge());
    }



}
