package weekFive;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // array 1

        System.out.println("Enter number of array elements: ");
        final int array1 = scan.nextInt();
        int[] array = new int[array1];

        for (int i = 0; i < array1; i++) {
            System.out.print("Enter array element " + i + ": ");
            array[i] = scan.nextInt();
        }
        System.out.println("\nArray 1");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // array 2

        int[] array2 = new int[array1];

        for (int i = 0; i < array1; i++) {
            array2[i] = array[i];
        }
        System.out.println("\nArray 1 - copy");
        for (int element : array2) {
            System.out.print(element + " ");
        }

        // array 3

        int[] array3 = new int[array1];

        for (int i = 0; i < array1; i++) {
            array3[i] = array[i];
        }
        System.out.println("\nArray 3");
        for (int element : array3) {

            System.out.print((element * element) + " ");
        }

        // array 4

        int[] array4 = new int[array1];

        for (int i = 0; i < array1; i++) {
            array4[i] = array[array1 - 1 - i];
        }
        System.out.println("\nArray 4");
        for (int element : array4) {
            System.out.print(element + " ");
        }
    }
}
