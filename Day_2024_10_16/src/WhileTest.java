import java.util.Scanner;

public class WhileTest {
	
	static Scanner sc;
	static int number;
	static int result;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		result = 0;
		try {
			do {
				System.out.print("Please enter a number(Enter 0 to exit)");
				SetNumber(sc.nextInt());
				result = result + number;	
			} while(number != 0);
			System.out.println("총 합계 = " + result);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void SetNumber(int n) {
		number = n;
	}
	
}
