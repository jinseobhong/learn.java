import java.util.ArrayList;

public class Practice {

	static ArrayList<Integer> numbers;
	static ArrayList<Integer> temp;

	public static void main(String[] args) {
		// TODO : Printing a sequence using a loop
		temp = new ArrayList<Integer>();
		try {
			for (int i = 0; i <= 9; i++) {
				temp.add(i);
			}
			SetNumbers(temp);
			System.out.println(numbers);
			temp.clear();
			for (int i = 1; i <= 10; i++) {
				temp.add(i);
			}
			SetNumbers(temp);
			System.out.println(numbers);
			temp.clear();
			for (int i = 0; i <= 10; i++) {
				if (i % 2 != 0) {
					temp.add(i);
				}
			}
			SetNumbers(temp);
			System.out.println(numbers);
			temp.clear();
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					temp.add(i);
				}
			}
			SetNumbers(temp);
			System.out.println(numbers);
			temp.clear();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static void SetNumbers(ArrayList<Integer> array) {
		numbers = array;
	}
	private static ArrayList<Integer> GetNumbers() {
		return numbers;
	}

}
