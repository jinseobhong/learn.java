
public class RoopTest {

	public static void main(String[] args) {
		// Add value from 1 to 10
		int result = 0;
		// Initialize condition value → Range to repeat the loop (conditional expression) →
		// If the conditional expression is satisfied, the loop statement is executed. → Operation of condition value to repeat (increment/decrement expression)
		// i as a control variable(Index)
		// The value of i increases by 1
		// Compound assignment operator i += 1
		for (int i = 1; i <= 10; i++) {
			result = result + i;
		}
		System.out.println(result);

		// Sum from 25 to 77
		for (int i = 25; i <= 77; i++) {
			result = result + i;
		}
		System.out.println(result);

		return;
	}
}
