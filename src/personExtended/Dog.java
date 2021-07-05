package personExtended; //name,age,colour,speak()

public class Dog {

	public String name;
	public int age;
	public String colour;

	public Dog() {
		System.out.println("Omae wa mou shinderou!");
	}

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		System.out.println(this);

		Dog dog = new Dog("Akira", 4, "Black");
		Dog dog2 = new Dog("Gaijin", 3, "White");
		Dog dog3 = new Dog("Musashi", 2, "Black & White");
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
