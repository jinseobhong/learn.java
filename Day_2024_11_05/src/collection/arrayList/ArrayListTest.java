package collection.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arNum = new ArrayList<Integer>();
        // Adding values to ArrayList
        arNum.add(1);
        arNum.add(2);
        arNum.add(3);
        arNum.add(4);
        arNum.add(5);
        // Assign the value 100 to index 2
        arNum.add(2, 100);
        // Class ArrayList.get(index i) : Returns the value of the index entered in the parameter
        System.out.println(arNum.get(0));
        // Print the values of indices of ArrayList
        for (Integer i : arNum) {
            System.out.println(i + " ");
        }
    }
}
