import java.util.ArrayList;

public class Practice3 {

	static ArrayList<Integer> numbers;
	static Integer temp;

	public static void main(String[] args) {
		// TODO : Printing a sequence using a loop

		// Initial variable
		numbers = new ArrayList<Integer>();
		try {
			// TODO : Find the least common multiple of 5 and 7
			if (temp == null || temp < 5) {
				temp = 5;
			}
			while (true) {
				temp += 5;
				if (temp % 5 == 0 && temp % 7 == 0) {
					numbers.add(temp);
					break;
				}
			}
			SetNumbers(numbers);
			System.out.println(GetNumbers());
			numbers.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// TODO : Array of integers from 1 to 20 excluding multiples of 3
			if (temp == null || temp < 1) {
				temp = 1;
			}
			for (temp = 0; temp <= 20; temp++) {
				if (temp % 3 != 0) {
					numbers.add(temp);
				}
			}
			SetNumbers(numbers);
			System.out.println(GetNumbers());
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
