package project4;

import java.util.Arrays;

public class SelectionSortPractice {

    // step 1
    public int[] SelectionSortPractice(int[] array){
        // array size variable
        int n = array.length;
        // step 1 - for loop (HINT: include n and minimum variable inside the for loop)
        // int minimum = i

        // step 2 - nested for loop for finding the actual smallest element in the unsorted tail (HINT: include minimum variable inside the for loop)
        // if statement
        // minimum = j

        // variable for temporary swap position
        int temp = array[minimum];
        array[minimum] = array[i];
        array[i] = temp;
        return array;
    }

    public void main(String[] args) {
        SelectionSortPractice sort = new SelectionSortPractice();
        int[] array = {30, 11, 42, 56, 32};
        // create a sorted array
        System.out.println(Arrays.toString(/*sorted array*/));
    }
}
