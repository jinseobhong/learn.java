package system;

public class ArrayCopyTest {
    public static void main(String[] args) {
        // Copy of array
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = new int[5];
        // Pay attention to the index of the value to retrieve and the index length of the value to retrieve.
        System.arraycopy(ar, 2, ar2, 0, ar.length - 2);
        for (int i : ar2) {
            System.out.println(i);
        }
    }
}
