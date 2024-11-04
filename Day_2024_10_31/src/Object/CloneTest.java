package Object;

public class CloneTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = arr.clone();

        arr[0] = 1000;
        // Rather than assigning the address value of the original object, a copied object is created with the same member and method values.
        System.out.println(arr2[0]);
    }
}
