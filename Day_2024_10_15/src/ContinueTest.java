
public class ContinueTest {

	public static void main(String[] args) {
		// Continue proceeds to the next increment/decrement expression in the loop.
		// If there is no code written under the Continue keyword, it is meaningless.
		// In a loop where i increases and decreases from 1 to 10, if the value of i is 7, the following increase or decrease formula is used:
		for (int i = 1; i <= 10; i++) {
			// If the value of i is 7, the repetition statement increases and decreases.
			if (i == 7) {
				continue; // to the next step
			}
			System.out.println(i);
		}
		// In a loop where i increases and decreases from 1 to 20, if the value of i is 13, the following increase or decrease formula is used:
		for (int i = 1; i <= 10; i++) {
			// i의 값이 13일 경우 반복문의 증감식으로
			if (i == 13) {
				continue; // to the next step
			}
			System.out.println(i);
		}

	}

}
