package weekThree;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a season (Winter, Spring, Summer, Fall):");
        String season = scan.nextLine();

        switch(season){
            case "Winter":
                System.out.println("Winter months: December, January, February");
                break;
            case "Spring":
                System.out.println("Spring months: March, April, May");
                break;
            case "Summer":
                System.out.println("Summer months: June, July, August");
                break;
            case "Fall":
                System.out.println("Fall months: September, October, November");
                break;
            default:
                System.out.println("Please enter a valid season.");
                break;
        }

    }
}
