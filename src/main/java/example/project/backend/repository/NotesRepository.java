package example.project.backend.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import example.project.backend.entity.Note;
import example.project.backend.entity.Person;

@Repository
public class NotesRepository {
	private List<Note> notes = new ArrayList<Note>();

	public List<Note> getAllNotes() {
		return notes;
	}

	public Note createNote(Person person, String text, Date date) {
		// TODO Auto-generated method stub
		return null;
	}
}
