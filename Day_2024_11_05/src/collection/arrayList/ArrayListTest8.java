package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest8 {
    public static void main(String[] args) {
        // Union : Test about ArrayList.addAll()
        List<Integer> targetLists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listToMerge = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
        // Combined ArrayList
        targetLists.addAll(listToMerge);

    }
}
