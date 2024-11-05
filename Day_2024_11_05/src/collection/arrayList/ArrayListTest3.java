package collection.arrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        // Test about Class ArrayList.add(int index,E element);
        List<String> presidents = new ArrayList<>();
        presidents.add("전두환");
        presidents.add("김영삼");
        presidents.add("김대중");
        presidents.add(1, "노태우");
        for (String s : presidents) {
            System.out.println(s);
        }
    }
}
