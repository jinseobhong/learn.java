package utilites.string;

public class StringTest4 {
    public static void main(String[] args) {
        String str = "String Search Method of String Class";
        // Search of index
        // indexOf() searches whether there is a value at the index from the beginning.
        System.out.println("T in front: " + str.indexOf('t'));
        // lastIndexOf() searches from behind to see if there is a value in the index.
        System.out.println("T in the back: " + str.lastIndexOf('t'));
        // When searching for a string that does not exist : Returns -1, -1 at index array raises an exception where the length of the array is out of range.
        System.out.println("Z in front: " + str.indexOf('Z'));
        // When searching a string, the index value of the first array of the string is returned.
        System.out.println("String in front: " + str.indexOf("String"));
        System.out.println("String in front: " + str.lastIndexOf("String"));
    }
}
