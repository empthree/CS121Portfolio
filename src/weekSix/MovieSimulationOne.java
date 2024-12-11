package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many movies are there?\n");
        int NUM_ELEMENTS = scan.nextInt();
        scan.nextLine();

        String[] movieNames = new String[NUM_ELEMENTS];
        String[] movieTypes = new String[NUM_ELEMENTS];
        int[] movieAvail = new int[NUM_ELEMENTS];
        double[] moviePrices = new double[NUM_ELEMENTS];

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("Enter the name of the movie:");
            movieNames[i] = scan.nextLine();
            System.out.println("Is the movie 2D or 3D?");
            movieTypes[i] = scan.nextLine();
            System.out.println("How many seats are available?");
            movieAvail[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("How much is a ticket?");
            moviePrices[i] = scan.nextDouble();
            scan.nextLine();
        }

        movieDetails(movieNames, movieTypes, movieAvail, moviePrices, NUM_ELEMENTS);
    }

    public static void movieDetails(String[] movieNames, String[] movieTypes, int[] movieAvail, double[] moviePrices, int NUM_ELEMENTS) {
        System.out.println("\n----- Movie Details -----\n");
        System.out.printf("%-20s %-20s %-25s %-20s%n\n", "Movie Name", "Movie Type", "Movie Availability", "Movie Price");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.printf("%-20s %-20s %-25d %-20f%n", movieNames[i], movieTypes[i], movieAvail[i], moviePrices[i]);
        }
    }
}
