package utilites.string;

public class StringTest7 {
    public static void main(String[] args) {
        // Replaces all oldChar characters in a string with newChar.
        String str = "Dokdo is Japanese territory. Tsushima is Japanese territory.";
        System.out.println(str.replace("Japanese", "Korea"));
        // Replaces the first searched substring.
        System.out.println(str.replaceFirst("Japanese", "Korea"));
    }
}
