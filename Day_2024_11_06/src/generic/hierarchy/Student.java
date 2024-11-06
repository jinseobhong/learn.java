package generic.hierarchy;

import java.util.Objects;

public class Student extends Human {

    Integer stNumber;

    public Student() {
        super();
    }

    public Student(String name, Integer age, Integer stNumber) {
        super(name, age);
        this.stNumber = stNumber;
    }

    public void intro() {
        System.out.println("Name is " + this.getName() + ", age is " + this.getAge() + ", Student Number is " + this.getStNumber());
    }

    public Integer getStNumber() {
        return stNumber;
    }

    public void setStNumber(Integer stNumber) {
        this.stNumber = stNumber;
    }

}
