package class_object;

public class Student {

    public Student(){}

    public Student(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        addStudent();
    }

    public static int numberOfStudents = 0;

    public static final String program = "Software Engineer at Test Program";


    public String fName;
    public String lName;
    public int age;




    public void study(){
        System.out.println(this.fName + " studies");
    }
    public void rests(){
        System.out.println(fName + " " + lName + " rests");
    }

    public static void addStudent(){
        numberOfStudents++;
    }


    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

    }
}
