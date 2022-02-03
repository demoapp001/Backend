package example.project.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.project.backend.entity.Note;
import example.project.backend.repository.NotesRepository;

@Service
public class NoteService {

	@Autowired
	private NotesRepository noteRepository;
	
	public List<Note> getAllNotes() {
		return noteRepository.getAllNotes();
	}

}
