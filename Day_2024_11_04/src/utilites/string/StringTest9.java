package utilites.string;

public class StringTest9 {
    public static void main(String[] args) {
        // Separate each token with a separator
        String originCities = "서울,대전,대구,부산";
        String[] cities = originCities.split(",");
        for (String s : cities) {
            System.out.println(s);
        }
        // Separate each token with a separator
        String originPath = "user/data/app/local";
        String[] paths = originPath.split("/");
        for (String s : paths) {
            System.out.println(s);
        }
        // Combine strings
        String str3 = String.join("/", "user", "data", "app", "local");
    }
}