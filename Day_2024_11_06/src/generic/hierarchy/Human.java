package generic.hierarchy;

import java.util.Objects;

public class Human {
    String name;
    Integer age;

    public Human() {
        super();
    }

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void intro() {
        System.out.println("Name is " + this.getName() + ", age is " + this.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Human human)) return false;
        return Objects.equals(this.name, human.name) && Objects.equals(this.age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
