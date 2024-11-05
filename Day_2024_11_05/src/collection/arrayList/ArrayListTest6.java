package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest6 {
    public static void main(String[] args) {
        // Test about Class ArrayList.indexOf(Object o);
        List<String> presidents = new ArrayList<>();
        presidents.add("전두환");
        presidents.add("김영삼");
        presidents.add("김대중");
        if (presidents.indexOf("노태우") != -1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
