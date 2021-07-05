package personExtended;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Cat> cats = new ArrayList<>();

		new Cat("Gregor", 2, "Black");
		new Cat("Vladimir", 3, "Grey");
		new Cat("Stalin", 4, "Tortoiseshell");
		new Cat("Karl", 3, "White");
		new Cat("Gorbachev", 5, "White");

		ArrayList<Dog> dogs = new ArrayList<>();

		new Dog("Akira", 4, "Black");
		new Dog("Gaijin", 3, "White");
		new Dog("Musashi", 2, "Black & White");

		new PersonManager();

		new Person("John", 32, "Mechanic", cats, dogs);
		new Person("Fred", 22, "Student", cats, dogs);
		new Person("Robert", 20, "Unemployed", cats, dogs);
		new Person("Harry", 26, "Deceased", cats, dogs);
		new Person("Laura", 22, "Waitress", cats, dogs);
		new Person("Francesca", 45, "Manager", cats, dogs);
		new Person("Luigi", 12, "Student", cats, dogs);
		new Person("Rachel", 30, "Web Designer", cats, dogs);

		System.out.println("Name: ");
		System.out.println("Age: ");
		System.out.println("Job: ");
		System.out.println("Cat: ");
		System.out.println("Dog: ");
	}
}
