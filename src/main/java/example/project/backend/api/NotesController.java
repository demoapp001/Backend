package example.project.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/add/notes")
	public Note createNote(@RequestParam String uname, @RequestBody NoteDTO noteDTO) {
		return notesService.createNote(uname, noteDTO);
	}	

}
