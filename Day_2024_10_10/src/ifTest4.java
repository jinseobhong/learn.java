import java.util.Scanner;

public class ifTest4 {

	public static void main(String[] args) {
		int num;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Integer 1: ");
		num = sc.nextInt();
		System.out.print("Integer 2: ");
		num2 = sc.nextInt();
		System.out.print("Integer 3: ");
		num3 = sc.nextInt();

		int max = 0;
		if (num > max) {
			max = num;
		}
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.print("The biggest value is: " + max);

		return;

	}

}
