package project4;


import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] array = {30, 21, 44, 59, 29};
        int[] sorted = sort.selectionSort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
