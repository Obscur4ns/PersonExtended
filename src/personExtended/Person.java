package personExtended; //name,age,jobtitle,listcat,listdog,addcat/dog,removecat/dog

import java.util.ArrayList;

public class Person {

	private String name;
	private int age;
	private String job_title;
	private ArrayList<Pet> pets = new ArrayList<>();

	public Person(String name, int age, String job_title) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setJobTitle(job_title);

	}

	public Person() {
		System.out.println("I drink your milkshake!");
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 122) {
			this.age = age;
		} else {
			System.out.println("Invalid age: " + age);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return job_title;
	}

	public void setJobTitle(String job_title) {
		this.job_title = job_title;
	}

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job Title ");
		System.out.println(this.job_title);

		System.out.print("Pets: [");
		for (Pet pet : this.pets) {
			pet.Print();
		}
		System.out.println("]");
	}

	public void addPet(Pet pet) {
		this.pets.add(pet);

	}

	public void removeCat(Pet pet) {
		this.pets.remove(pet);
	}

}
