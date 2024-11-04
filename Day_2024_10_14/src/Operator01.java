
public class Operator01 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 6;
		// +, -, * ,/
		System.out.println(num1 + num2);// addition
		System.out.println(num1 - num2);// subtraction
		System.out.println(num1 * num2);// multiply
		System.out.println(num1 / num2);// divide
		// Integer-to-integer operations only return integers(int/double)
		// Remainder operator : % (Return the remainder)
		System.out.println(num1 % num2);// Return the remainder after divide
		// Even Number, Odd number
		System.out.println(num1 % 2 == 0); // Even Number
		System.out.println(num1 % 2 != 0); // Odd number
	}

}
