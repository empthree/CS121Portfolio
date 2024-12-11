package weekFour;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter number of students: ");
        int numStudents = scan.nextInt();

        System.out.println("Enter number of tests per student: ");
        int numTests = scan.nextInt();

        for (int student = 1; student <= numStudents; student++){
            double total = 0;

            System.out.println("\nStudent number " + student + ":");
            for (int test = 1; test <= numTests; test++) {
                System.out.println("\nEnter score " + test + ":");
                double score = scan.nextDouble();
                total += score;
            }
            double average = total / numTests;
        System.out.println("The average for student " + student + " is: " + average);
        }
    }
}
