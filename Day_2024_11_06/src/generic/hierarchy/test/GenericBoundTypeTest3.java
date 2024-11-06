package generic.hierarchy.test;

import generic.hierarchy.Box;
import generic.hierarchy.Human;
import generic.hierarchy.Student;

public class GenericBoundTypeTest3 {
    public static void main(String[] args) {
        GenericBoundTypeTest3 test = new GenericBoundTypeTest3();
        Human h = new Human("Hong Ihyeon", 33);
        Box<Human> human = new Box<Human>(h);
        test.printMan(human);
        
        Student s = new Student("Hong Ihyeon", 33, 40);
        Box<Student> student = new Box<Student>(s);
        test.printMan(student);
    }

    public void printMan(Box<? extends Human> box) {
        box.getValue().intro();
    }
}
