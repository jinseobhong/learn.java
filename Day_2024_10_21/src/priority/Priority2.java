package priority;

public class Priority2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		// && is || Has higher precedence than operator
		// true || (true && false) || false
		if (a == 1 || b == 2 && c == 10 || d == 10) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// Assignment operators operate from the right
		a = b = c = d = 5;

	}

}
