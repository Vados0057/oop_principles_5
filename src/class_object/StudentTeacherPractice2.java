package class_object;

public class StudentTeacherPractice2 {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alex", "Smith");

        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Lion", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher1.addStudent(student3);
        teacher1.addStudent(student4);

        Student oldestStudent = new Student();
        Student youngestStudent = new Student();
        for (Student student : teacher1.getStudents()) {

        }





    }
}
