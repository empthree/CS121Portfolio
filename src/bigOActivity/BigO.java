package bigOActivity;

public class BigO {

    //0(1) - constant time, doesn't change based off of increasing input
    public static void printOnce(int n){
        System.out.println(n);
    }

    //0(n) - linear time, execution time grows linearly with the input size
    public static void printNTimes(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("#" + (count + 1) + " Internet Historian");
            count++;
        }
        System.out.println();
    }

    //0(n^2) - quadratic time, execution time grows quadratically with the input size
    public static void printNSquaredTimes(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                System.out.println("#" + (count + 1) + ": " + "The nested for loop count " + "i: " + i + "\tThe magicians " + "j: " + j + "\n");
            }
        }
    }

}
