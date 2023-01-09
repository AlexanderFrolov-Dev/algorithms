package quick_sort;

public class QuickSort {
    public static void sort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = partition(array, from, to);
            sort(array, from, pivot - 1);
            sort(array, pivot + 1, to);
        }
    }

    private static int partition(int[] array, int from, int to) {
        int pivot = array[0];
        int middleArray = array[(from + to) / 2];
        int temp = middleArray;
        middleArray = pivot;
        array[0] = temp;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int replacementNumber;
            int replacementPosition;
            int numberAfterPivot;
            int numberBeforePivot;
            int positionAfterPivot = i + 1;
            int positionBeforePivot = i - 1;

            if(currentValue > pivot) {
                replacementNumber = currentValue;
                numberAfterPivot = array[positionAfterPivot];

            }
        }

        //TODO: moving values around pivot,
        // return new pivot index
        return 0;
    }

}
