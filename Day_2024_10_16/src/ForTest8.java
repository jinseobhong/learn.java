import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		// TODO : Drawing stars
		char star = '*';
		for(int i=1; i <=5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);	
			}
			System.out.println();
		}
	}
}
