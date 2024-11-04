package priority;
import java.util.Scanner;

public class AvgTest {

	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer sum;
	private Double avg;
	private Scanner sc;

	public static void main(String[] args) {
		AvgTest avg = new AvgTest();
		avg.sc = new Scanner(System.in);
		System.out.print("Korean : ");
		avg.kor = avg.sc.nextInt();
		System.out.print("English : ");
		avg.eng = avg.sc.nextInt();
		System.out.print("Math : ");
		avg.math = avg.sc.nextInt();
		avg.sum = avg.kor + avg.eng + avg.math;
		avg.avg = (double) (avg.sum / 3);
		System.out.println("Total : " + avg.sum + "\nAverage : " + avg.avg);
	}

}
