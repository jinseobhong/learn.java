package collection.arrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // Test about Class ArrayList.remove(int index);
        List<String> presidents = new ArrayList<>();
        presidents.add("전두환");
        presidents.add("김영삼");
        presidents.add("김대중");
        presidents.remove(2);
        for (String s : presidents) {
            System.out.println(s);
        }
    }
}
