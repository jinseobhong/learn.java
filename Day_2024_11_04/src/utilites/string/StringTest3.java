package utilites.string;

public class StringTest3 {
    public static void main(String[] args) {
        String str = "KOREA";
        String str2 = "korea";
        // Comparison of values
        System.out.println((str == str2 ? true : false));
        System.out.println(str.equals(str2) ? true : false);
        // Ignore Case
        System.out.println(str.equalsIgnoreCase(str2) ? true : false);
        // Is it earlier than the dictionary listing order?
        System.out.println(str.compareTo(str2));
        // Is it case in-sensitive and faster than dictionary entry order?
        System.out.println(str.compareToIgnoreCase(str2));
    }
}
