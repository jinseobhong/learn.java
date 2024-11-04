package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// Initialization of Array
		int[] scores = { 77, 67, 87, 11, 13 };
		// When creating and declaring separately, new int[] cannot be omitted.
		// int[] scores;
		// scores = new int[] { 77, 67, 87, 11, 13 };
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		// Reassign an array to a variable
		scores = new int[] {55,22};
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}

}
