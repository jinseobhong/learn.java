package wrappers;

public class UnboxingTest {
    public static void main(String[] args) {
        // Unboxing : Wrapper class of primitive type → Primitive type
        Integer wrapInt = 639;
        int i = wrapInt.intValue();
        // Auto Boxing & Auto Unboxing
        Integer wrapInt2 = 639;
        int i2 = wrapInt2;
    }
}
