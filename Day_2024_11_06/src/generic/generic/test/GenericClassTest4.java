package generic.generic.test;

import generic.generic.Box;

public class GenericClassTest4 {
    public static void main(String[] args) {
        Box<Integer> ib = new Box<>(1234);
        Integer ibv = ib.getValue();
        System.out.println(ibv);

        Box<Double> db = new Box<>(56.78);
        Double dbv = db.getValue();
        System.out.println(dbv);

        System.out.println(ib.getClass());

    }
}
