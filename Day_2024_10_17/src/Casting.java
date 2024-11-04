
public class Casting {

	public static void main(String[] args) {
		// TODO : Understanding casting operators

		// Type conversion
		// Integer : byte → short → int → long
		// Automatically converts to the direction of the arrow
		short s = 0;
		byte b = 1;
		s = b;
		System.out.println(s);
		// Integers and Float Numbers
		// Integer : less precise type & Float : more precise type
		// Integer type → Float type
		// Automatically converts to the direction of the arrow
		int i = 1;
		double d = i;
		System.out.println(d);
		// Forced converts of type
		i = (int)d;
		System.out.println(i);
	}

}
