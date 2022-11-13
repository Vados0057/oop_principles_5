package class_object;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudents);
        System.out.println(Student.program);

        Student student1 = new Student("John", "Doe", 45);

        System.out.println(Student.numberOfStudents);

        Student student2 = new Student("Jane", "Doe", 23);

        System.out.println(Student.numberOfStudents);

        student1.study(); //John studies
        student2.study(); //Jane studies

        student2.rests();
        student1.rests();


    }
}
