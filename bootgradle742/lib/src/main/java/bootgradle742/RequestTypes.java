package bootgradle742;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestTypes {
	
	@GetMapping
	public String getRequest() {
		return "this is GET request";
	}
	
	@PostMapping
	public String postRequest() {
		return "this is POST request";
	}
	@DeleteMapping
	public String deleteRequest() {
		return "this is DELETE request";
	}
	
	@PutMapping
	public String putRequest() {
		return "this is PUT request";
	}
	
}
