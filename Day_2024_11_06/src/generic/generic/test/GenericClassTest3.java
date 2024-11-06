package generic.generic.test;

import generic.generic.ObjectBox;

public class GenericClassTest3 {
    public static void main(String[] args) {
        ObjectBox ib = new ObjectBox(1234);
        Object ibv = ib.getValue();
        System.out.println(ibv);

        ObjectBox db = new ObjectBox(56.78);
        Object dbv = db.getValue();
        System.out.println(dbv);
    }
}
