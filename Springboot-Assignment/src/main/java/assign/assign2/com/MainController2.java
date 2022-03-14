package assign.assign2.com;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController2 {
	
//	private User user;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String validate(@RequestBody User user) {
		if(user.getUsername().equals("Aman") && user.getPassword().equals("111"))
		{
			return "valid user";
		}else {
			return "invalid";
		}
				
	}
	
	

}
