
public class ForTest2 {

	public static void main(String[] args) {
		// Repeat 100 times
		int result = 0;
		// Initialize condition value → Range to repeat the loop (conditional expression) →
		// If the conditional expression is satisfied, the loop statement is executed. → Operation of condition value to repeat (increment/decrement expression)
		// i as a control variable(Index)
		// The value of i increases by 1
		// Compound assignment operator i += 1;
		for (int i = 1; i <= 100; i++) {
			result = i;
			System.out.println("repeating " + i + " times.");
		}
		System.out.println("Repeat " + result + " times completed");
		return;
	}
}
