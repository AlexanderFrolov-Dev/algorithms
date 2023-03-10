import array_max_value.ArrayMaxValue;
import binary_search.BinarySearch;
import merge_sort.MergeSort;
import quick_sort.QuickSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//======================================================================================================================
//        int[] array = {-2147483648, 0, 57, 2147483647};
//        System.out.println(ArrayMaxValue.getMaxValue(array));
//======================================================================================================================

//======================================================================================================================
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Вася");
//        list.add("Ася");
//        list.add("Коля");
//        list.add("Оля");
//        list.add("Поля");
//        list.add("Толя");
//        list.add("Миша");
//        list.add("Гриша");
//        list.add("Маша");
//        list.add("Саша");
//        list.add("Глаша");
//        list.add("Галя");
//        list.add("Валя");
//        list.add("Дима");
//        list.add("Рита");
//        list.add("Витя");
//        list.add("Митя");
//        list.add("Валера");
//        list.add("Лера");
//        list.add("Лёня");
//        list.add("Сеня");
//        Collections.sort(list);
//
//        BinarySearch binarySearch = new BinarySearch(list);
//        System.out.println(binarySearch.search("Саша"));
//======================================================================================================================

//======================================================================================================================
//        int[] array = {5, 8, 1, 3, 9, 7, 6, 4, 10, 2};
//        QuickSort.sort(array);
//======================================================================================================================

//======================================================================================================================
        int[] array = {5, 8, 1, 3, 9, 7, 6, 4, 10, 2};
        int[] left = {1, 2, 3, 4, 5};
        int[] right = {6, 7, 8, 9, 10};
        MergeSort.merge(array, left, right);

//======================================================================================================================
    }
}
