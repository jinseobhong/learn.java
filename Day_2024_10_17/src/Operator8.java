import java.util.Scanner;

public class Operator8 {

	private Scanner sc;
	private Integer number;

	public static void main(String[] args) {
		Operator8 opr = new Operator8();
		// TODO : Determine whether the input integer is even or odd
		opr.sc = new Scanner(System.in);
		System.out.print("Integer : ");
		opr.SetNumber(opr.sc.nextInt());
		System.out.println(opr.isEvenNumber(opr.GetNumber()));

	}

	public void SetNumber(Integer i) {
		number = i;
	}

	public Integer GetNumber() {
		return number;
	}

	public boolean isEvenNumber(Integer i) {
		return i % 2 == 0 ? true : false;
	}
}