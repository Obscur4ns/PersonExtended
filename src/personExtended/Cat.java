package personExtended; //name,age,colour,speak()

public class Cat {

	public String name;
	public int age;
	public String colour;
	private Cat cat;

	public Cat() {
		System.out.println("I serve the Soviet Union.");
	}

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		System.out.println(this);

		Cat cat = new Cat("Gregor", 2, "Black");
		Cat cat2 = new Cat("Vladimir", 3, "Grey");
		Cat cat3 = new Cat("Stalin", 4, "Tortoiseshell");
		Cat cat4 = new Cat("Karl", 3, "White");
		Cat cat5 = new Cat("Gorbachev", 5, "White");
	}

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Colour: ");
		System.out.println(this.colour);

	}

}
