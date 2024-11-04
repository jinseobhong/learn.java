package utilites.string;

public class StringTest5 {
    public static void main(String[] args) {
        String[] files = {
                "girl.jpg",
                "boy.png",
                "child.avi",
                "school.jpg",
                "book.gif"
        };
        // Output only files with jpg extension
        for (String s : files) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }
        }
    }
}
