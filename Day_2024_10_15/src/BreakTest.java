
public class BreakTest {

	public static void main(String[] args) {
		// The break keyword ends a loop statement.
		// While repeating increasing the value of i from 1 to 10, if the value of i is 7, the loop ends.
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}

		// In a loop that increases the value of i from 1 to 20, the loop ends when the value of i is 13.
		for (int i = 1; i <= 20; i++) {
			if (i == 13) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
	}

}
