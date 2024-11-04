package utilites.string;

public class StringTest2 {
    public static void main(String[] args) {
        String str = "Beautiful our country";
        System.out.println("Length(How many characters is it long?): " + str.length());
        // isEmpty == String.length() == 0 : true
        System.out.println("is Empty?: " + str.isEmpty());
        // Created with default constructor
        String str2 = new String();
        System.out.println(str2);
        System.out.println(str2.length());

        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());
        // Assign an empty string
        String str3 = new String("");
        System.out.println(str3);
        System.out.println(str3.length());

        System.out.println(str3.isEmpty());
        System.out.println(str3.isBlank());
        // Assign a blank string : isBlank() does not handle blank spaces
        String str4 = new String(" ");
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());
        // null does not point to an address, so a NullPointException is raised.
        String str5 = null;
        System.out.println(str5);
        System.out.println(str5.length());
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());
    }
}
