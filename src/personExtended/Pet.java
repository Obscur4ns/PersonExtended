package personExtended;

public class Pet {

	private int noOfLegs;
	private String colour;
	private boolean domesticated;
	private String name;
	private int age;
	private String breed;

	public Pet(String name, int age, String colour, String breed, int noOfLegs, boolean domesticated) {
		super();
		this.noOfLegs = noOfLegs;
		this.colour = colour;
		this.domesticated = domesticated;
		this.name = name;
		this.age = age;
		this.breed = breed;

	}

	public void communicate() {
		System.out.println("Hello there");
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isDomesticated() {
		return domesticated;
	}

	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Colour: ");
		System.out.println(this.colour);
		System.out.print("Breed: ");
		System.out.println(this.breed);

	}
}
