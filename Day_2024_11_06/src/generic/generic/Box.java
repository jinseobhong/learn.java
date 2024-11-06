package generic.generic;

public class Box<A> {
    A value;

    public Box(A value) {
        this.value = value;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
