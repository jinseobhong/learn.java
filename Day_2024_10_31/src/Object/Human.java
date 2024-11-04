package Object;

import java.util.Objects;

public class Human {
    public String name;
    public Integer age;

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public boolean isValueEquals(Object o) {
        if (o instanceof Human) {
            Human other = (Human) o;
            return (age == other.getAge() && name.equals(other.name));
        }
        return false;
    }

    // Override about Object's methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public void intro() {
        System.out.println("I am " + name + ", "+age+" years old");
    }
}
