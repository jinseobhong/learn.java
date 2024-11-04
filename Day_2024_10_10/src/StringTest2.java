
public class StringTest2 {

	public static void main(String[] args) {
		String str = "Hello. \nNice to meet you.";
		System.out.println(str);
		// Text block : The format is free, but the quote output (',") is also free.
		String str2 = """
				Hello
				Nice to meet you.
				'Korean' "SeJong"
					  """;
		System.out.println(str2);
	}

}
