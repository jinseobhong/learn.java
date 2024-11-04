package reference;

public class Reference {

	public static void main(String[] args) {
		// 참조형
		// stack 영역(주소), heap 영역(값)
		// stack은 주소를 값으로 가지고 heap의 값을 참조.
		String name = "홍길동";
		// 기본형(stack 영역에 메모리를 할당)
		int number = 10;

		int i = 1234;
		// 주소 값을 가지고 int[] ar은 stack에 생성, ar의 88,99,70은 주소 값을 가지고, 참조하고 있는 형태
		int[] ar = new int[] { 88, 99, 70 };

	}
}
