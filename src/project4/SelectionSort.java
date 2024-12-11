package project4;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
