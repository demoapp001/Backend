package example.project.backend.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import example.project.backend.entity.Note;

@Repository
public class NotesRepository {
	private List<Note> notes = new ArrayList<Note>();

	public List<Note> getAllNotes() {
		return notes;
	}
}
