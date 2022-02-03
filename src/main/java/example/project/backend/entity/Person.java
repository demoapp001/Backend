package example.project.backend.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private long id;
	private String uname;
	private String name;
	private List<Note> notes;
}
