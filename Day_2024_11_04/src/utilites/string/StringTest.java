package utilites.string;

public class StringTest {
    public static void main(String[] args) {
        // String Class
        String str = new String("Beautiful");
        System.out.println(str);

        String str2 = "Our country";
        System.out.println(str2);

        char[] ar = {'K', 'O', 'R', 'E', 'A'};
        String str3 = new String(ar);
        System.out.println(str3);
        // The length of the array is a variable
        System.out.println(ar.length);
        // Get the length of a string array
        System.out.println("KOREA".length());
    }
}
