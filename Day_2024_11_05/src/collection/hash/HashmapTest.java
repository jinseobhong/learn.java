package collection.hash;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {
    public static void main(String[] args) {
        Map<String, Integer> snack = new HashMap<String, Integer>();
        snack.put("오징어 땅콩", 2500);
        snack.put("죠리퐁", 1900);
        snack.put("핫브레이크", 450);
        snack.put("빼빼로", 600);
        String mySnack = "죠리퐁";
        System.out.println(mySnack + "의 가격은 " + snack.get(mySnack));

    }
}
