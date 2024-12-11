package weekOne;

public class Firstcodewithme {
    public static void main(String[] args) {
        //Declaring
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        //Initializing
        age = 19;
        gpa = 3.6;
        letterGrade = 'A';
        csMajor = true;
        name = "Emma";

        String favoriteColor = "Green";

        //Printing
        System.out.println();
        System.out.print("");
        System.out.printf("The age of this person is: %d%n",age);
        System.out.printf("The gpa is: %.2f%n", gpa);
        System.out.printf("The letter grade is: %c%n", letterGrade);
        System.out.printf("Is it true that your major is Computer Science? %b%n", csMajor);
        System.out.printf("This person's name is: %s%n", name);
        System.out.printf("This person's favorite color is: %s%n", favoriteColor);

    }
}
