package weekEight.packageDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Joey", "Smith", 16, "Computer Science", "9881");

        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
        System.out.println("Student ID: " + student.getStudentID());
    }
}