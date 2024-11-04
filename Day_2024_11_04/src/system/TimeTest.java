package system;

public class TimeTest {
    public static void main(String[] args) {
        // Measurement of time
        int sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "second to work");
    }
}