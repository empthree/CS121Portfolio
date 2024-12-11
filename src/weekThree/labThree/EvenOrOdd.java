package weekThree.labThree;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //scanner

        Scanner scan = new Scanner(System.in);

        int input;

        System.out.println("Enter a number: ");
        input = scan.nextInt();

        if ((input % 2) == 0){
            System.out.println("Even");
        }
        else System.out.println("Odd");

    }
}
