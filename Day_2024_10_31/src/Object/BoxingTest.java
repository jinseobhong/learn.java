package Object;

public class BoxingTest {

    public static void main(String[] args) {
        // Wrapper class for int
        int i = 1234;
        Integer intWrapper = i;
        String str = intWrapper.toString();
        System.out.println(str);
        // wrapper class for double
        double d = 3.14;
        Double doubleWrapper = d;
        str = doubleWrapper.toString();
        System.out.println(str);

    }
}
