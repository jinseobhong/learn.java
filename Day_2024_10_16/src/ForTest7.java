import java.util.Scanner;

public class ForTest7 {
	private static Scanner sc;
	private static int grade;
	public static void main(String[] args) {
		// TODO : If the grade is 1st grade or higher and 6th grade or lower, an error message is displayed if the wrong grade is entered.
		sc = new Scanner(System.in);
		while(true) {
			System.out.print("Grade(1~6 years) : ");
			SetGrade(sc.nextInt());
			if(grade >= 1 && grade <= 6) {
				break;
			} else {
				System.out.println("Please re-enter your grade.");
			}
		}
		System.out.println(grade + " year student.");
	}
	
	private static void SetGrade(int i) {
		grade = i;
	}
	
	private static int GetGrade() {
		return grade;
	}

}
