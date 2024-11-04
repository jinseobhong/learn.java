package utilites.string;

public class StringTest6 {
    public static void main(String[] args) {
        String str = "korea";
        // Convert lowercase to uppercase
        System.out.println(str.toUpperCase());
        // Convert uppercase to lowercase
        System.out.println(str.toLowerCase());
        // Remove leading and trailing spaces from string
        str = " Republic of the Korea ";
        System.out.println(str.trim());
        // Concatenate strings
        System.out.println(str.trim().concat("! Fighting!"));
    }
}
