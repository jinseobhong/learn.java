
public class DoWhileTest {

	public static void main(String[] args) {
		// Do ~ while
		int i = 1; // Initialization formula
		// Executes first, then repeats execution if the condition expression is met
		do {
			System.out.println("repeating " + i + " times.");
			i++;
		} while (i <= 10);
		System.out.println("repeating " + (i - 1) + " times.");

	}
}
