package collection.arrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // Due to polymorphism, List is the parent of ArrayList, so it is established.
        List<Integer> arNum = new ArrayList<>();
        // Class ArrayList.isEmpty(); : No index?
        System.out.println(arNum.isEmpty());
        // Class Math.Random(); : Occurrence of random numbers
        // Enter 6 random values up to 45 into ArrayList.
        for (int i = 0; i < 6; i++) {
            int temp = ((int) (Math.random() * 45) + 1);
            // Check if duplicate values exist, after input value in ArrayList
            if (!arNum.contains(temp)) {
                arNum.add(temp);
            }
        }
        // Prints the value entered in ArrayList
        for (Integer i : arNum) {
            System.out.println(i);
        }
        // Another example
        for (int i = 0; i <= arNum.size(); i++) {
            System.out.println(arNum.get(i));
        }
    }
}