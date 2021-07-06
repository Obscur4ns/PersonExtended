package personExtended;

public class App {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();
		Person p1 = new Person();
		p1.setAge(32);
		p1.setJobTitle("Mechanic");
		p1.setName("Mikhail");
		System.out.println("Age: " + p1.getAge());
		System.out.println("Job Title: " + p1.getJobTitle());
		System.out.println("Name: " + p1.getName());
		manager.addPerson(p1);

		Person p2 = new Person();
		p2.setAge(26);
		p2.setJobTitle("Software Engineer");
		p2.setName("Daniel");
		System.out.println("Age: " + p2.getAge());
		System.out.println("Job Title: " + p2.getJobTitle());
		System.out.println("Name: " + p2.getName());
		manager.addPerson(p2);

		manager.print();

		manager.findByName("Barry");

		Cat cat1 = new Cat("Satoshi", 3, "Black", "Moggy", 4, true);

		Dog dog1 = new Dog("Benson", 2, "Brown & White", "Springer Spaniel", 4, true);

	}
}
