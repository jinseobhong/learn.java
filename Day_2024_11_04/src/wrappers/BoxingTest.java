package wrappers;

public class BoxingTest {
    public static void main(String[] args) {
        // Boxing : Primitive type → Reference type
        // Convert primitive types to reference types using wrapper classes.
        Integer wrapInt = 629;
        // Integer type → String type
        String str = wrapInt.toString();
        // String type → Integer type
        wrapInt = Integer.parseInt(str);

    }
}
