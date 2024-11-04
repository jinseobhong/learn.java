
public class CarTest {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "Korando";
		korando.gasoline = false;
		System.out.print(korando.name + ": ");
		korando.run();
		korando.stop();
		
		Car equus = new Car();
		equus.name = "Equus";
		equus.gasoline = true;
		System.out.print(equus.name);
		
	}

}
