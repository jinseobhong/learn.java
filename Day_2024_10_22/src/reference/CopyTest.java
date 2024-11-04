package reference;

public class CopyTest {

	public static void main(String[] args) {
		// 기본형의 복사
		// 값의 복사(원본과 사본은 독립적이며, 서로 영향을 끼치지 않음)
		int i = 10;
		int i2 = i;
		
		i = 100;
		System.out.println("i 값은 : " + i);
		System.out.println("i2 값은 : " + i2);
		
	}
}
