package hash.test;

import hash.Human;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Human, Integer> donates = new HashMap<>();
        donates.put(new Human("김기남", 42), 10000);
        donates.put(new Human("박수빈", 24), 20000);
        donates.put(new Human("박수빈", 20), 5000);
        donates.put(new Human("최상미", 11), 8000);

        //Outputs Null because the address values between objects are different
        Human park = new Human("박수현", 20);
        System.out.println(park.getName() + "씨의 기부금 = " + donates.get(park));
    }
}
