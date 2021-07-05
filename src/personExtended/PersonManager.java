package personExtended; //listperson,addperson(),removeperson(),findpersonbyname()

import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		this.people.add(person);

	}

	public void removePerson() {
		people.remove(null);
	}

	public void findPerson(String name) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).name == name) {
				people.get(i).Print();

				return;
			}
		}

	}

}
