package weekFive;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        //array 1
        int [][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("\nArray 1\n");

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        // array 2
        double [][] array2 = new double [4][3];
                array2[0][0] = 1.1;
                array2[0][1] = 2.2;
                array2[0][2] = 3.3;
                array2[1][0] = 4.4;
                array2[1][1] = 5.5;
                array2[1][2] = 6.6;
                array2[2][0] = 7.7;
                array2[2][1] = 8.8;
                array2[2][2] = 9.9;
                array2[3][0] = 10.0;
                array2[3][1] = 11.1;
                array2[3][2] = 12.2;

        System.out.println("\nArray 2\n");

        for(double[] outerArray : array2) {
            for (double element : outerArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //array 3
        String [][] array3 = {
                {"Ann","Andy","Andrea"},
                {"John","Joan","Joanna"}
        };

        System.out.println("\nArray 3\n");

        for(int i = 0; i < array3.length; i++){
            for(int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
