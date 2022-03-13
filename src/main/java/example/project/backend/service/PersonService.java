package example.project.backend.service;

import example.project.backend.entity.Person;

public interface PersonService {
	public Person getPersonWithUsername(String uname);
}
