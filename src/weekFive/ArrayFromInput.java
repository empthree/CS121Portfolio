package weekFive;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String[] name = new String[3];
      String[] major = new String[3];
      int[] age = new int[3];

      for (int i = 0; i < 3; i++){
          System.out.println("Please enter your name: ");
          name[i] = scan.nextLine();
          System.out.println("Please enter your major: ");
          major[i] = scan.nextLine();
          System.out.println("Please enter your age: ");
          age[i] = Integer.parseInt(scan.nextLine());
          System.out.println();
      }
      System.out.printf("%-20s %-20s %-20s%n", "Name", "Major", "Age");

      for (int i = 0; i < name.length; i++){
          System.out.printf("%-20s %-20s %-20d%n", name[i], major[i], age[i]);
      }
    }
}
