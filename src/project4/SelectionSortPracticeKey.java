package project4;

import java.util.Arrays;
public class SelectionSortPracticeKey {

    // step 1
    public int[] SelectionSortPractice(int[] array) {
        // array size variable
        int n = array.length;
        // step 1 - for loop (HINT: include n and minimum variable inside the for loop)
        for (int i = 0; i < n; i++) {
            // minimum variable
            int minimum = i;
            // step 2 - nested for loop for finding the actual smallest element in the unsorted tail (HINT: include minimum variable inside the for loop)
            for (int j = i + 1; j < n; j++) {
                // if statement
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            // variable for temporary swap position
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public void main(String[] args) {
        SelectionSortPractice sort = new SelectionSortPractice();
        int[] array = {30, 11, 42, 56, 32};
        int[] sortedArray = sort.SelectionSortPractice(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
