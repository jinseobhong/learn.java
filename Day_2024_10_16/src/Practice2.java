import java.util.ArrayList;

public class Practice2 {

	static ArrayList<Integer> numbers;
	static ArrayList<Integer> temp;

	public static void main(String[] args) {
		// TODO : Printing a sequence using a loop
		temp = new ArrayList<Integer>();
		try {
			// Among positive integers, the first number is a multiple of 5 and a multiple of 7.
			for (int i = 1;; i++) {
				if (i % 5 == 0 && i % 7 == 0) {
					temp.add(i);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void SetNumbers(ArrayList<Integer> array) {
		numbers = array;
	}

	private static ArrayList<Integer> GetNumbers() {
		return numbers;
	}

}
