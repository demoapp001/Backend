package example.project.backend.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.project.backend.api.dto.NoteDTO;
import example.project.backend.entity.Note;
import example.project.backend.entity.Person;
import example.project.backend.repository.NotesRepository;
import example.project.backend.repository.PersonRepository;

@Service
public class NotesService {

	@Autowired
	private NotesRepository noteRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	public List<Note> getAllNotes() {
		return noteRepository.getAllNotes();
	}

	public Note createNote(String uname, NoteDTO noteDTO) {
		Person person = personRepository.findByUname(uname);
		if(person.equals(Optional.empty())) {
			throw new Exception("Username was not found");
		}
		
		return noteRepository.createNote(person, noteDTO.getText(), new Date());
	}

}
