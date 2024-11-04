package system;

public class SystemExitTest {
    public static void main(String[] args) {
        // System.out.exit();
        double d = Math.sqrt(-2);
        System.out.println(d);
        if (Double.isNaN(d)) {
            System.out.println("Is not a number");
            // if isNan is true, System exit
            System.exit(0);
        } else {
            System.out.println("Is a number");

        }
    }
}
