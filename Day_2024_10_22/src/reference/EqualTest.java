package reference;

public class EqualTest {

	public static void main(String[] args) {
		// 기본형에서의 == : 값의 비교
		// 기본형은 heap에 값을 메모리를 할당
		int i = 12;
		int i2 = 12;
		if (i == i2) {
			System.out.println("기본형이 같다");
		}

		// 참조형의 == : stack 에서 가르키는 heap의 주소 값이 같은 지 비교
		int[] ar = new int[] { 1, 2, 3 };
		int[] ar2 = new int[] { 1, 2, 3 };
		int[] ar3 = ar;
		if (ar == ar2) {
			System.out.println("참조형 같다");
		}
		if (ar == ar3) {
			System.out.println("주소 값이 같다");
		}
	}

}
