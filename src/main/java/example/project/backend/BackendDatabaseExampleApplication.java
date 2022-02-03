package example.project.backend;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import example.project.backend.entity.Note;
import example.project.backend.entity.Person;
import example.project.backend.repository.NotesRepository;
import example.project.backend.repository.PersonRepository;

@SpringBootApplication
public class BackendDatabaseExampleApplication implements CommandLineRunner {

	@Autowired
	private NotesRepository noteRepository;

	@Autowired
	private PersonRepository personRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(BackendDatabaseExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Note note1 = new Note(1, new Date(), "Hello World text!");
		Note note2 = new Note(2, new Date(), "A second note");
		
		List<Note> notes = noteRepository.getAllNotes();
		notes.addAll(Arrays.asList(note1, note2));
	
		Person person1 = new Person(1, "sandras", "Sutő András", notes);
		Person person2 = new Person(2, "garon", "Gábor Áron", Collections.emptyList());
	
		personRepository.getAllPersons().addAll(Arrays.asList(person1, person2));
	}
}
