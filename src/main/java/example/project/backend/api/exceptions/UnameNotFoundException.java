package example.project.backend.api.exceptions;

public class UnameNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnameNotFoundException(String uname) {
        super("User name was not found: " + uname);
    }
}
