package generic.hierarchy;

public class Box<T extends Human> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void intro() {
        this.getValue().intro();
    }
}
