package method;

public class MethodTest7 {

	private int[] numbers;
	private int total;

	public static void main(String[] args) {
		MethodTest7 method = new MethodTest7();
		method.setNumbers(new int[] { 3, 6, 9 });
		method.setTotal(method.getNumbers());
		System.out.println(method.getTotal());
	}
	// Variable argument
	public void setTotal(int... numbers) {
		if (this.total != 0) {
			this.total = 0;
		}
		for (int i : numbers) {
			this.total += i;
		}
	}

	public int getTotal() {
		return this.total;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers() {
		return numbers;
	}
}
