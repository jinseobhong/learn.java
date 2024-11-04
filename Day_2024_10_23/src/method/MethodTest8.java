package method;

public class MethodTest8 {

	private int[] numbers;
	private Number max;

	public static void main(String[] args) {
		MethodTest8 method = new MethodTest8();
		method.setMax(5.1, 3.3);
		System.out.println(method.getMax());
	}
	
	public void setMax(int a, int b) {
		if (a > b) {
			this.max = a;
		} else {
			this.max = b;
		}
	}

	public void setMax(double a, double b) {
		if (a > b) {
			this.max = a;
		} else {
			this.max = b;
		}
	}

	public Number getMax() {
		return this.max;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers() {
		return numbers;
	}
}
