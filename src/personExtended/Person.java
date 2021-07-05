package personExtended; //name,age,jobtitle,listcat,listdog,addcat/dog,removecat/dog

import java.util.ArrayList;

public class Person {

	public String name;
	public int age;
	public String job_title;
	public ArrayList<Cat> cats = new ArrayList<>();
	public ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String job_title, ArrayList<Cat> cat, ArrayList<Dog> dog) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
		this.cats = cat;
		this.dogs = dog;
		System.out.println(this);
		System.out.println("I drink your milkshake!");
	}

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job Title ");
		System.out.println(this.job_title);
		System.out.print("Cat: ");
		System.out.println(this.cats);
		System.out.print("Dog: ");
		System.out.println(this.dogs);
	}

	public void addCat(Cat cat) {
		this.cats.add(cat);

	}

	public void removeCat(Cat cat) {
		this.cats.remove(cat);
	}

	public void addDog(Dog dog) {

		this.dogs.add(dog);

	}

	public void removeDog(Dog dog) {
		dogs.remove(dog);
	}

}
