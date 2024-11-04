
public class Operator2 {

	public static void main(String[] args) {
		// TODO : Understanding casting operators

		int number1 = 10;

		// Assignment operator
		number1 = number1 + 1;
		System.out.println(number1);

		// Compound assignment operator
		number1 =+ 1;
		System.out.println(number1);

		// Prefix form of unary operator : First increment the value of the variable and then return
		number1 = 0;
		System.out.println(number1++);
		System.out.println(number1);

		// Postfix form of unary operator : Return the value of the variable first and then increment it
		number1 = 0;
		System.out.println(++number1);
		System.out.println(number1);

	}

}
