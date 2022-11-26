package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee_Exercise {
    public static void main(String[] args) {

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
        new Employee("Andrii","Developer", 25, c1),
        new Employee("Yildiz","System Architect", 23, c2),
        new Employee("Malek","Developer", 30, c3),
        new Employee("Saeed","Manager",35 ,c3),
        new Employee("Samir", "Tester",20, c2),
        new Employee("Viktoriya", "Designer",30 ,c1),
        new Employee("Ibrahim", "Designer",27 ,c1),
        new Employee("Jeremiah", "Scrum Master", 21 , c2),
        new Employee("Olena","Tester", 29, c3),
        new Employee("Yoanna","Tester", 23, c1)
    ));

        /*
        Tesla = 4
        USBank = 3
        Verizon = 3

        Employee for each position
        Tester = 3
        Developer =  2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1

        Find youngest
        Youngest tester = Samir with the age of 20
        Youngest developer = Andrii with the age of 25
        Youngest designer  = Ibrahim with the age of 27

        Find the company for
        Manager = Saeed works at "Verizon"
        System architect = Yildiz works at "USBank"
        Scrum Master = "Jeremiah" works at "USBank"
         */

        int teslaEmployees = 0;
        int verizonEmployees = 0;
        int usbankEmployees = 0;

       int tester = 0;
       int developer = 0;
       int manager = 0;
       int designer = 0;
       int systemArchitect = 0;
       int scrumMaster = 0;

       Employee managerEmployee = new Employee();
       Employee systemArchitectEmployee = new Employee();
       Employee scrumMasterEmployee = new Employee();

        for (Employee employee : employees) {
            if (employee.getCompany().getName().equals("Tesla"))teslaEmployees++;
            else if (employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            if (employee.getJobPosition().equals("Tester")) tester++;
            else if (employee.getJobPosition().equals("Developer")) developer++;
            else if (employee.getJobPosition().equals("Manager")) manager++;
            else if (employee.getJobPosition().equals("Designer")) designer++;
            else if (employee.getJobPosition().equals("System Architect"))  systemArchitect++;
            else scrumMaster++;

            if (employee.getJobPosition().equals("Manager")) managerEmployee = employee;
            else if (employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
            else if (employee.getJobPosition().equals("Scrum Master")) scrumMasterEmployee = employee;

        }

        System.out.println("\n-------Employee numbers for each company------\n");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("\n------Employee for each position-----\n");
        System.out.println("Tester = " + tester);
        System.out.println("Developer = " + developer);
        System.out.println("Manager = " + manager);
        System.out.println("Designer = " + designer);
        System.out.println("System Architect = " + systemArchitect);
        System.out.println("Scrum Master = " + scrumMaster);

        System.out.println("\n-----------YOUNGEST EMPLOYEE----------------\n");
        Employee youngestTester = employees.stream().filter(e -> e.getJobPosition().equals("Tester")).min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Younger Tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());

        Employee youngestDeveloper = employees.stream().filter(e -> e.getJobPosition().equals("Developer")).min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Younger Developer = " + youngestDeveloper.getFullName() + " with the age of " + youngestDeveloper.getAge());

        Employee youngestDesigner = employees.stream().filter(e -> e.getJobPosition().equals("Designer")).min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Younger Designer = " + youngestDesigner.getFullName() + " with the age of " + youngestDesigner.getAge());

        System.out.println("\n---------Employee by profession---------\n");
        System.out.println("Manager = " + managerEmployee.getFullName()+ " works at " + managerEmployee.getCompany().getName());
        System.out.println("System Architect = " + systemArchitectEmployee.getFullName()+ " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println("Scrum Master = " + scrumMasterEmployee.getFullName()+ " works at " + scrumMasterEmployee.getCompany().getName());

    }
}
