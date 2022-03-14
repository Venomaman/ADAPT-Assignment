package assign.assign1.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		return "hello world";
	}

}
