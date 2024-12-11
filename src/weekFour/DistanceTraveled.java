package weekFour;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speed;
        System.out.println("Enter the speed of the vehicle in mph:");
        speed = scan.nextInt();

        int time;
        System.out.println("Enter the number of hours traveled:");
        time = scan.nextInt();

        System.out.println("Hour" + "       " + "Distance traveled");
        for (int t = 1; t <= time; t++) {
            int dist = speed * t;
            System.out.printf("%-10d %-12d%n", t, dist);
        }
    }
}
