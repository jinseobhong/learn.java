package collection.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest7 {
    public static void main(String[] args) {
        // Bulk processing
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : lists) {
            System.out.println(i);
        }
    }
}
