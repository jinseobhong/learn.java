package system;

public class PrintfTest {
    public static void main(String[] args) {
        // System.out.print(); : Only print
        // System.out.println(); : Print and line break
        int i = 123;
        double d = 3.14;
        String str = "Republic of Korea";
        System.out.println("i: " + i + " d: " + d + " str: " + str);
        // System.out.printf(); : (Format you want to print, Variable in % ...)
        // Formatting
        // %d = Integer format
        // %f = Float format
        // %.nf = Express float number with n decimal places
        // %s : String format
        System.out.printf("i: %d d: %.2f str: %s", i, d, str);
    }
}