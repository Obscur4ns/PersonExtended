package personExtended;

public class Cat extends Pet {

	public Cat(String name, int age, String colour, String breed, int noOfLegs, boolean domesticated) {
		super(name, age, colour, breed, noOfLegs, domesticated);

	}

	@Override
	public void communicate() {
		System.out.println("I serve the Soviet Union.");
	}

	public void HereKitty() {
		System.out.println("You dare make demands of me?");
	}

}
