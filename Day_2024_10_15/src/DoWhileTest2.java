
public class DoWhileTest2 {

	public static void main(String[] args) {
		// Do ~ while
		// Add from 1 to 10
		int result = 0; // result of addition

		int i = 1; // initialization expression
		do {
			result = result + i;
			i++;
		} while (i <= 10);

		System.out.println(result);

	}
}
