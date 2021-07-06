package personExtended;

public class Dog extends Pet {

	public Dog(String name, int age, String colour, String breed, int noOfLegs, boolean domesticated) {
		super(name, age, colour, breed, noOfLegs, domesticated);

	}

	@Override
	public void communicate() {
		System.out.println("Omae wa mou shinderou!");
	}

	public void Fetch() {
		System.out.println("Watashi wa anata no shimo be ni wa narimasen.");
	}

}
