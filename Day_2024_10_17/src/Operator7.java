
public class Operator7 {

	public static void main(String[] args) {
		// TODO : Understanding casting operators

		// Ternary Conditional Operator(ternary operator)
		// Conditional expression ? Return value if true:Return value if false
		int age = 19;
		boolean adult;
		
		adult = age >= 19 ? true:false;
		if(age >= 19 ) {
			adult = true;
			
		} else {
			adult = false;
		}
		System.out.println(adult);
				
	}

}
