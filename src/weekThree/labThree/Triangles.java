package weekThree.labThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        //either
        Scanner scan = new Scanner(System.in);

        int sideOne, sideTwo, sideThree;

        System.out.println("Please enter three side lengths: ");
        sideOne = scan.nextInt();
        sideTwo = scan.nextInt();
        sideThree = scan.nextInt();

        if ((sideOne != sideTwo) && (sideOne != sideThree) && (sideTwo != sideThree)) {
            System.out.println("Scalene");
        } else if ((sideOne != sideTwo) && (sideOne == sideThree) || (sideOne == sideTwo) && (sideOne != sideThree) || (sideOne != sideTwo) && (sideTwo == sideThree)){
            System.out.println("Isosceles");
        } else if ((sideOne == sideTwo) && (sideOne == sideThree)) {
            System.out.println("Equilateral");
        } else System.out.println("Not a triangle");
    }
}
