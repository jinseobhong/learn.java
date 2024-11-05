package collection.arrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        // Iterator
        List<String> presidents = new LinkedList<>();
        presidents.add("전두환");
        presidents.add("김영삼");
        presidents.add("김대중");
        presidents.add(1, "노태우");
        // Loop using iterators
        Iterator<String> iterator = presidents.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
