package collection.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        // Test about Class LinkedList.add(int index,E element);
        List<String> arName = new LinkedList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add(1, "노태우");
        for (String s : arName) {
            System.out.println(s);
        }

    }
}
