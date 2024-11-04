package method;

public class MethodTest {

	private int result;

	public static void main(String[] args) {
		// Method : something done with a specific purpose
		MethodTest method = new MethodTest();
		method.Sum(1, 10);
		System.out.println(method.GetResult());
	}

	public void SetResult(int i) {
		result = i;
	}

	public int GetResult() {
		return result;
	}

	public boolean isActualNumber(Number n) {
		if (n.getClass() == Float.class || n.getClass() == Double.class) {
			return true;
		} else {
			return false;
		}
	}

	public void Sum(Integer s, Integer e) {
		for (int i = s; s <= e; s++) {
			result += s;
		}
	}

}
