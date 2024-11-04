package reference;

public class CopyTest2 {

	public static void main(String[] args) {
		// 참조형의 복사
		// 주소 값의 복사
		int[] ar = { 1, 2, 3 };
		int[] ar2 = ar;

		// 같은 주소의 값을 참조하므로, ar[0]와 ar2[0]이 모두 영향을 받음.
		ar2[0] = 100;
		System.out.println("ar[0] : " + ar[0]);
		System.out.println("ar2[0] 값은 : " + ar2[0]);

	}
}
