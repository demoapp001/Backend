package example.project.backend.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import example.project.backend.entity.Person;

@Repository
public class PersonRepository {
	private List<Person> persons = new ArrayList<Person>();

	public List<Person> getAllPersons() {
		return persons;
	}
	
	public Person getPersonWithUsername(String uname) {
		return persons
				.stream()
				.filter(person -> person.getUname().equals(uname))
				.findFirst()
				.orElse(null);
	}
}
