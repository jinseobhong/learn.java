package collection.arrayList;

import java.util.*;

public class ColllectionsTest {
    public static void main(String[] args) {
        List<String> generals = new ArrayList<>();
        generals.add("장보고");
        generals.add("김유신");
        generals.add("강감찬");
        generals.add("을지문덕");
        // Collections.sort(Collection c); : Sort according to the consonant and vowel order of each language
        Collections.sort(generals);
        // Collections.reverse(Collection c); : Invert the index values of an collection
        Collections.reverse(generals);
        // Collections.shuffle(Collenction c); : Randomly shuffle elements
        Collections.shuffle(generals);
        for (String name : generals) {
            System.out.println(name);
        }
    }
}
