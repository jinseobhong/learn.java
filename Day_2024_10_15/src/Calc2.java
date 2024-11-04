import java.util.Scanner;

public class Calc2 {

	public static void main(String[] args) {
		// Calculator for simple arithmetic operations
		int num1;
		int num2;
		String opr;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first integer : ");
		num1 = sc.nextInt();
		System.out.print("Please enter the operator : ");
		opr = sc.next();
		switch (opr) {
		case "+":
			System.out.print("Please enter the second integer : ");
			num2 = sc.nextInt();
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "= " + result);
			break;
		case "-":
			System.out.print("Please enter the second integer : ");
			num2 = sc.nextInt();
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "= " + result);
			break;
		case "*":
			System.out.print("Please enter the second integer : ");
			num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("It cannot be multiplied by 0.");
				break;
			} else {
				result = (double) num1 * num2;
				System.out.println(num1 + "*" + num2 + "= " + result);
				break;
			}
		case "/":
			System.out.print("Please enter the second integer : ");
			num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("It cannot be multiplied by 0.");
				return;
			} else {
				result = (double) num1 / num2;
				System.out.println(num1 + "/" + num2 + "= " + result);
				break;
			}
		default:
			System.out.println("Please enter the correct arithmetic operator.");
			return;
		}
	}

}
