package example.project.backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.project.backend.api.dto.NoteDTO;
import example.project.backend.entity.Note;
import example.project.backend.service.NotesService;

@RestController
@RequestMapping("/notes")
public class NotesController {
	@Autowired
	private NotesService notesService;
	
	@PostMapping("/add/note")
	public Note createNote(@RequestParam String uname, @RequestBody NoteDTO noteDTO) {
			return notesService.createNote(uname, noteDTO);
	}	

	@PutMapping("/update/note")
	public Note createNote(@RequestBody NoteDTO noteDTO) {
		return notesService.updateNote(noteDTO);
	}	
	
	@DeleteMapping("/remove/note/{id}")
	public void removeNote(@PathVariable(value = "id") Long id) {
		notesService.deleteNote(id);
	}	
	
	@PutMapping("/share/note/{id}")
	public Note shareNote(@PathVariable(value = "id") Long id, @RequestParam String uname) {
		return notesService.shareNote(id, uname);
	}
}
