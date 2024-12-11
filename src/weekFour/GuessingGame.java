package weekFour;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String answer;
        int total = 0;
        int answer = 33;
        boolean q = false;



        while (!q) {
            System.out.println("Enter a number between 1 and 100, or enter q to quit.");
            String userGuess = scan.nextLine();

            if (userGuess.equals("q")) {
                System.out.println("Quitter! The answer was " + answer + ".");
                q = true;
                break;

            } else
            {
                int uGuess = Integer.parseInt(userGuess);
                if (uGuess > answer) {
                    System.out.println("Too high. Guess again.");

                } else if (uGuess < answer) {
                    System.out.println("Too low. Guess again.");

                } else if(uGuess == answer){
                    System.out.println("Correct!");
                    q= true;
                    break;
                }else {
                    System.out.println("Please enter a valid number or 'q' to quit");

                }
            }
            total++;
        }
        System.out.println("You did it! The answer was: " + answer + ". It took you " + total + " tries.");
    }


}
