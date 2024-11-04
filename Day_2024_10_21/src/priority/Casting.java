package priority;

public class Casting {

	public Integer integer;
	public String string;

	public static void main(String[] args) {
		Casting cast = new Casting();
		// Convert String → Number
		cast.SetString("123");
		// Convert String → Number
		cast.SetInteger(Integer.parseInt(cast.GetString()));
		System.out.println(cast.GetString() + 1);
		System.out.println(cast.GetInteger() + 1);
		// Convert Number → String
		cast.string = String.valueOf(cast.GetInteger());
		System.out.println(cast.GetString() + 1);
		// When a unary operator is used alone, both the antecedent and the consequent have the same result.
		++cast.integer;
		System.out.println(cast.integer);
	}

	public void SetInteger(Integer i) {
		integer = i;
	}

	public Integer GetInteger() {
		return integer;
	}

	public void SetString(String s) {
		string = s;
	}

	public String GetString() {
		return string;
	}

}
