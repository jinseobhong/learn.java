package method;

import java.util.Scanner;

public class MethodTest2 {

	private Scanner sc;
	private Integer year;
	private Integer month;
	private Integer days;

	public static void main(String[] args) {
		// Enter the year and column and check how many days there are
		MethodTest2 method = new MethodTest2();
		method.sc = new Scanner(System.in);
		System.out.print("What year is it? : ");
		method.year = method.sc.nextInt();
		System.out.print("What month is it? : ");
		method.SetMonth(method.sc.nextInt());
		method.SetDays(method.year, method.month);
		System.out.println(method.year + "Year " + method.month + "is " + method.GetDays());
	}

	public void SetMonth(Integer month) {
		if (IsValidMonth(month)) {
			this.month = month;
		} else {
			System.err.println("If the range of months is not");
			System.out.print("What month is it? : ");
			this.SetMonth(this.sc.nextInt());
		}
	}

	public boolean IsValidMonth(Integer month) {
		if (month >= 1 && month <= 12) {
			return true;
		}
		return false;
	}

	public boolean isLeapYear(Integer year, Integer month) {
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			}
			return false;
		}
		return false;
	}

	public void SetDays(Integer year, Integer month) {
		int[] arDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear(year, month)) {
			this.days = 29;
		} else {
			this.days = 28;
		}
		this.days = arDays[month - 1];
	}

	public Integer GetDays() {
		return this.days;
	}

}
