package example.project.backend.api.exceptions;

public class NoteNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoteNotFoundException(Long id) {
        super("Note with id was not found: " + id);
    }
}