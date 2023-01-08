package binary_search;

import java.util.ArrayList;

public class BinarySearch {
    private ArrayList<String> list;

    public BinarySearch(ArrayList<String> list) {
        this.list = list;
    }

    public int search(String query) {
        return search(query, 0, list.size() - 1);
    }

    private int search(String query, int from, int to) {
        int middle = (from + to) / 2;

        if (query.compareTo(list.get(middle)) == 0) {
            return list.indexOf(query);
        } else if (query.compareTo(list.get(middle)) > 0) {
            return search(query, middle, to);
        } else if (query.compareTo(list.get(middle)) < 0) {
            return search(query, from, middle);
        } else {
            return  -1;
        }
    }
}
