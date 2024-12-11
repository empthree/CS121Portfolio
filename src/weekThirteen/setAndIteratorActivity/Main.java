package weekThirteen.setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RealEstateSet instance = new RealEstateSet();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----- Real Estate Property Management System -----");

        // menu

        while(true){
            System.out.println("\nPlease select an option:" +
                    "\n1: Add a property ID" +
                    "\n2: View all property IDs" +
                    "\n3: Exit");
            int menuInput = scan.nextInt();
            switch (menuInput){
                case 1:
                    instance.addProperties();
                    break;
                case 2:
                    instance.displayProperties();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }


    }
}
