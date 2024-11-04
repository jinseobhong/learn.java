package method;

import java.util.Scanner;

public class MethodTest9 {

	private Scanner sc;
	private int from;
	private int to;
	private int result;

	public static void main(String[] args) {
		MethodTest9 method = new MethodTest9();
		method.sc = new Scanner(System.in);
		System.out.print("1st value : ");
		method.from = method.sc.nextInt();
		System.out.print("2nd value : ");
		method.to = method.sc.nextInt();
		method.calcSumEven(method.from, method.to);

		System.out.println(method.GetResult());
	}

	public void calcSumEven(int from, int to) {
		for (int i = from; i <= to; i++) {
			if (i % 2 == 0) {
				this.result += i;
			}
		}
	}

	public int GetResult() {
		return this.result;
	}
}
