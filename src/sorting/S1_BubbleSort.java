package sorting;

/**
 * Bubble Sort
 * In-place Algorithm
 * O(n^2) time complexity - quadratic
 * Algorithm degrades quickly
 */
public class S1_BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnSortedIndex = intArray.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+"\t\t");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
//time complexity =O(n^2)