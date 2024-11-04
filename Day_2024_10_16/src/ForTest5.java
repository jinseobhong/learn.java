
public class ForTest5 {

	public static void main(String[] args) {
		// TODO : Add in increments from 1 to find the point at which it exceeds 100.
		int result = 0;
		for (int i = 1; i <= 100; i++) {
				result = result + i;
				if(result > 100) {
					System.out.println(i);
					break;
				}
			}
		}
	}


