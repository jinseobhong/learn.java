package array;

public class forEach {

	public static void main(String[] args) {
		// Improved for statement, for each statement
		// for (type variable: object of repetition) {}
		int[] score = { 88, 94, 72, 75, 23 };
		int total = 0;
		// Starts at index 0 and ends the loop when there are no more elements.
		// The value of the control variable of int s represents the position of the element of the array score[s] as s.
		for (int s : score) {
			total += s;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ((double) total / score.length));
	}

}
