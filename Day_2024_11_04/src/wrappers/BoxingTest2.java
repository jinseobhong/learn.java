package wrappers;

public class BoxingTest2 {
    public static void main(String[] args) {
        String a = "12";
        String b = "34";
        // Concatenation of strings
        System.out.println(a + b);
        // Addition of values
        // The + operator is processed later, so if you perform the + operation after executing each Integer.parseInt() function, the values are added.
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
    }
}