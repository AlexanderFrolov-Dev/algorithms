package merge_sort;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int n = array.length;
        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        array = new int[left.length + right.length];

        // Классический способ заполнения массива.
//        for (int i = 0; i < left.length; i++) {
//            array[i] = left[i];
//        }
//
//        for (int i = left.length; i < array.length; i++) {
//            array[i] = right[i - left.length];
//        }

        // Новый способ заполнения массива.
        System.arraycopy(left, 0, array, 0, left.length);

        if (array.length - left.length >= 0)
            System.arraycopy(right, left.length - left.length, array, left.length, array.length - left.length);
    }
}
