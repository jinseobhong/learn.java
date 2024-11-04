package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO : Assign 5 grades to array
		int length = 5;
		int[] scores = new int[length];
		scores[0] = 77;
		scores[1] = 11;
		scores[2] = 22;
		scores[3] = 33;
		scores[4] = 44;
		// The index assigned to the array is up to the length of the array -1.
		for (int i = 0; i < scores.length; i++) {
			System.out.println(String.valueOf(scores[i]));
		}
	}

}
