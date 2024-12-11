package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCustomerInfo{
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first name or 'q' to quit.");
            String first = scan.nextLine();
            if (first.equalsIgnoreCase("q")) break;
            firstName.add(first);

            System.out.println("Enter last name:");
            String last = scan.nextLine();
            lastName.add(last);

            System.out.println("Enter age:");
            int age = scan.nextInt();
            ageList.add(age);

            scan.nextLine();

        }
        System.out.println("---Information---");
        System.out.printf("%-10s %-10s %-5s%n", "First name", "Last name", "Age");
        for (int i = 0; i < firstName.size(); i++){
            System.out.println();
            System.out.printf("%-10s %-10s %-5s%n", firstName.get(i), lastName.get(i), ageList.get(i));
        }
        scan.close();
    }
}