
public class ForTest3 {

	public static void main(String[] args) {
		// TODO : Find the sum of multiples of 4 from 1 to 100.
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				result = result + i;
			}
		}
		System.out.println(result);
	}

}
