
public class ForTest4 {

	public static void main(String[] args) {
		// TODO : Output starts from 0 and increases by 0.5 until it is less than 3.0
		for (double d = 0; d < 3.0; d += 0.5) {
			// Skip 1.5 and print
			if(d == 1.5) {
				continue;
			}
			System.out.println(d);
		}
	}

}
