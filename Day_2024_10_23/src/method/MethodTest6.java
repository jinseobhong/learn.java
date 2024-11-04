package method;

public class MethodTest6 {

	private int[] numbers;

	public static void main(String[] args) {
		MethodTest6 method = new MethodTest6();
		method.setNumbers(new int[] { 3, 6, 9 });
		System.out.println("numbers[0]: " + method.getNumbers()[0]);
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers() {
		return numbers;
	}
}
