
public class Variable {

	public static void main(String[] args) {
		// Unable to calculate because byte is overflow
		byte b1 = 1;
		byte b2 = 2;
		// byte b3 = b1 + b2;
		// Byte, you need to cast to calculate the size
		short b3 = (short) (b1 + b2);
		// Unable to calculate due to overflow with short
		short s1 = 10;
		short s2 = 20;
		// short b3 = b1 + b2;
		// Need to cast to calculate about short
		int s3 = (int) (s1 + s2);
		// Automatically convert to Int due to overflow and then operate
		int i1 = 1;
		int i2 = 2;
		int i3 = i1 + i2;

	}

}
