package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Human hong = new Human(33, "Hong Ihyeon");
		hong.intro();
		Student lee = new Student(42, "Lee SungHo", 9312345, "Business Administration");
		lee.intro();
		lee.study();
		Graduate park = new Graduate(35, "Park Daehee", 95001122, "Computer Science", "Research on web security");
		park.intro();
		park.study();
		park.research();
		// Skipping the Super() constructor call
		Soldier kang = new Soldier(45, "Kang Gam-chan", 123);
		kang.intro();
		kang.fight();
		Thief hong2 = new Thief(15, "Hong Gil-dong", "Rich family", 2);
	}

}
