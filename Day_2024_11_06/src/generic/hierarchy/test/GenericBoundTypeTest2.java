package generic.hierarchy.test;

import generic.hierarchy.Box;
import generic.hierarchy.Human;

public class GenericBoundTypeTest2 {
    public static void main(String[] args) {
        GenericBoundTypeTest test = new GenericBoundTypeTest();
        Human h = new Human("Hong",33);
        Box<Human> human = new Box<>(h);
        human.intro();
    }
}
