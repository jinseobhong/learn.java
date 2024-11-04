package reference;

public class NullTest {

	public static void main(String[] args) {
		// Null : 참조 할 주소 값이 없음
		int[] ar = new int[] { 1, 2, 3 };
		System.out.println(ar[0]);
		if (ar != null) {
			System.out.println("ar isn't null");
		}
		// 주소 값이 있는 없는 상태
		String str = null;
		// 주소 값이 있는 상태
		String str2 = "";

		str = "abcd";
		// String은 char의 배열이므로, String.charAt 메서드는 char[]의 인덱스의 값을 반환
		char c = str.charAt(0);
		System.out.println(c);
	}

}
