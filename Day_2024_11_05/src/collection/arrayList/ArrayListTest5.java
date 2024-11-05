package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {
    public static void main(String[] args) {
        // Test about Class ArrayList.set(int index,E element);
        List<String> presidents = new ArrayList<>();
        presidents.add("전두환");
        presidents.add("김영삼");
        presidents.add("김대중");
        presidents.set(2, "원더걸스");
        for (String s : presidents) {
            System.out.println(s);
        }
    }
}
