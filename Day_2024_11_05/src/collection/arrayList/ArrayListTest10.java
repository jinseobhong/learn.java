package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest10 {
    public static void main(String[] args) {
        // Test about ArrayList.subList(int fromIndex, int toIndex);
        List<Integer> originLists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> sublists = originLists.subList(1, 4);
        // When the original value is changed, the sublist value is also changed.
        originLists.set(1, 100);
        for (int i : sublists) {
            System.out.println(i);
        }
    }
}
