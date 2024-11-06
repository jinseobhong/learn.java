package hash.test;

import hash.City;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    HashSet<String> kangwon;

    public static void main(String[] args) {
        HashSet<City> kangwon = new HashSet<>();
        kangwon.add(new City("춘천시"));
        kangwon.add(new City("철원군"));
        kangwon.add(new City("정선군"));
        kangwon.add(new City("강릉시"));
        kangwon.add(new City("춘천시"));

        // TODO : Create public Boolean HashSet.isCity(City city);
        Iterator<City> iter = kangwon.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
