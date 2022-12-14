package oop_principles.inharitance;

public class Person {

    //default constructor is here

        public Person(){
        }

    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    public Person(String fName, int age, String DOB) {
        this(fName, age);
        this.DOB = DOB;
    }

    public Person(String fName, int age, String DOB, String SSN) {
        this(fName, age, DOB);
        this.SSN = SSN;
    }
    //instance variables



    public String fName;
    protected int age;
    String DOB;
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void eat(){
        System.out.println("Person eats");
    }

    public void eat(String str){
        System.out.println("Person eats " + str);
    }

    public void sleep(){
        System.out.println("Person sleeps");
    }

    public void sleep(int hours){
        System.out.println("Person sleeps " + hours + " hours");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}