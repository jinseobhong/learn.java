import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// Enter your country
		Scanner sc = new Scanner(System.in);
		System.out.print("Country: ");
		String country = sc.next();
		// next(Return based on space)
		// nextLine(Return based on enter key)

		// Convert to lowercase
		// country = country.toLowerCase();
		// Convert to uppercase
		// country=country.toUpperCase()

		switch (country) {
		case "Korea":
			System.out.println("Seoul");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		case "China":
			System.out.println("Beijing");
			break;
		}
	}

}
