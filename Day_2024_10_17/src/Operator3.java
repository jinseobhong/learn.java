
public class Operator3 {

	public static void main(String[] args) {
		// TODO : Understanding casting operators

		// Prefix form of unary operator : First increment the value of the variable and then return
		int value = 2;
		int a = ++value;
		System.out.println("value = " + value + ", a = " + a);

		// Postfix form of unary operator : Return the value of the variable first and then increment it
		value = 2;
		a = value++;
		System.out.println("value = " + value + ", a = " + a);

	}

}
