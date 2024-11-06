package generic.generic.test;

import generic.generic.DoubleBox;
import generic.generic.IntBox;

public class GenericClassTest2 {
    public static void main(String[] args) {
        IntBox ib = new IntBox(1234);
        Integer ibv = ib.getValue();
        System.out.println(ibv);

        DoubleBox db = new DoubleBox(56.78);
        Double dbv = db.getValue();
        System.out.println(dbv);
    }
}
