package example.project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.project.backend.entity.Person;
import example.project.backend.repository.PersonRepository;

@Service
public class PersonServiceImplementation implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person getPersonWithUsername(String uname) {
		return personRepository.findByUname(uname);
	}
}
