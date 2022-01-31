package example.project.backend.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
	@RequestMapping(value="/")
	public String helloWorld() {
		return "Hello World";
	}
}
