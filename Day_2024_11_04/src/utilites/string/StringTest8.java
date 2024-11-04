package utilites.string;

public class StringTest8 {
    public static void main(String[] args) {
        // Extracts from the start point to just before the end point, and if the end point is omitted, extracts until the end.
        String str = "0123456789";
        // Class String.subString(n) : Extracts the string including the nth index to the end
        System.out.println(str.substring(6));
        // Class String.subString(n,n) : Extracts the string including the nth index to the end, The following example uses indices 3 to 7
        System.out.println(str.substring(3, 7));
        // When a string is a reference type, it has properties similar to primitive types.
        String str2 = str;
        str2 += "101112";
        System.out.println(str);
        System.out.println(str2);
    }
}
