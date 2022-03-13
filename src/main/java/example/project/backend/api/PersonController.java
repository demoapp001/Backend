package example.project.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.project.backend.entity.Note;
import example.project.backend.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@GetMapping("/all/notes")
	public List<Note> getAllNotes(@RequestParam String uname) {
		return personService.getPersonWithUsername(uname).getNotes();
	}	
}