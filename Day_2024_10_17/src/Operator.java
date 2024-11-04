
public class Operator {

	public static void main(String[] args) {
		// TODO : Understanding casting operators

		int number1 = 10;
		int number2 = 6;

		// Integer : The result of an integer and integer operation is an integer.
		System.out.println(number1 / number2);

		// Operations on integers and float numbers : If any of the operands is a float, the result is a float.
		System.out.println(number1 / (double) number2);
		System.out.println(366 / (double) 4);

		// Remainder operator : After dividing two numbers, discard the quotient and take only the remainder.
		// The operation priority is last.
		System.out.println(number1 % number2);
	}

}