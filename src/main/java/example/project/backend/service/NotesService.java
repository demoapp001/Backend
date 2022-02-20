package example.project.backend.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.project.backend.api.dto.NoteDTO;
import example.project.backend.api.exceptions.NoteNotFoundException;
import example.project.backend.api.exceptions.UnameNotFoundException;
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
		return (List<Note>) noteRepository.findAll();
	}

	public Note createNote(String uname, NoteDTO noteDTO) throws RuntimeException {
		Person person = personRepository.findByUname(uname);
		if (person == null) {
			throw new UnameNotFoundException(uname);
		}

		Note note = new Note();
		note.setText(noteDTO.getText());
		note.setDate(new Date());
		note = noteRepository.save(note);

		person.getNotes().add(note);
		personRepository.save(person);

		return note;
	}

	public Note updateNote(NoteDTO noteDTO) {
		Optional<Note> note = noteRepository.findById(noteDTO.getId());
		if (!note.isPresent()) {
			throw new NoteNotFoundException(noteDTO.getId());
		}

		note.get().setText(noteDTO.getText());
		return noteRepository.save(note.get());
	}

	public void deleteNote(Long id) {
		noteRepository.deleteById(id);
	}

	public Note shareNote(Long id, String uname) {
		Optional<Note> note = noteRepository.findById(id);
		if (!note.isPresent()) {
			throw new NoteNotFoundException(id);
		}
		
		Person person = personRepository.findByUname(uname);
		if (person == null) {
			throw new UnameNotFoundException(uname);
		}
		
		note.get().getSharedWith().add(person);
		return noteRepository.save(note.get());
	}

}
