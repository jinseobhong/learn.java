package priority;

public class Priority {

	public int number;
	
	public static void main(String[] args) {
		// Priority of four basic operations
		Priority prty = new Priority();
		prty.number = 1 + 3 * 2;
		System.out.println(prty.number);
		// If there are parentheses
		prty.number = (1+3) *2;
		System.out.println(prty.number);
		// The assignment operator = is of last order.
	}
}
