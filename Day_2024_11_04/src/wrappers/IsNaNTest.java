package wrappers;

public class IsNaNTest {
    public static void main(String[] args) {
        // NaN : Not a Number
        double d = Math.sqrt(-2);
        System.out.println(d);
        if(Double.isNaN(d)) {
            System.out.println("Is not a number");
        } else {
            System.out.println("Is a number");
        }
    }
}
