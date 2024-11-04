import java.time.LocalDateTime;

public class TimeTest {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		// Hour
		System.out.println(today.getHour());
		// Minute
		System.out.println(today.getMinute());
		// Second
		System.out.println(today.getSecond());
	}

}
