package class_object;

public class Animal {

    public Animal(){
    }

    //Create a constructor that takes 2 args -> name and age
    public Animal(String name, int age) {
        System.out.println("This is 2-args constructor");
        this.name = name;
        this.age = age;
    }

    //Create a constructor that takes 5 args


    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        this(name, age);
        System.out.println("This is 5-args constructor");
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    public static final boolean isExtinct = true;
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;


    @Override
    public String toString() {

        String result = "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age;

        if(isCarnivore) result += ", isCarnivore=" + isCarnivore;
        if(isHerbivore) result += ", isHerbivore=" + isHerbivore;
        if(isOmnivore) result += ", isOmnivore=" + isOmnivore;

        result += "}";

        return result;
    }



    public static void main(String[] args) {
        //Animal a1 = new Animal();
//        Animal a2 = new Animal("Dog", 3);
//        Animal a3 = new Animal("Cow", 5);
//        Animal a4 = new Animal("Cat", 1);


        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 5, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("\n------Printing the objects-----\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);


        System.out.println("\n--------static instance variables-------\n");
        System.out.println(Animal.isExtinct); // true


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

    }
}