package assign.assign3.com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController3 {
	
	@Autowired
	private InfoService infoService;
	
	//get all info.....
	/*
	 * @RequestMapping("/info") public List<Info> getAllInfo(){ return
	 * infoService.getAllInfo(); }
	 */
	
	//get single info....
	@RequestMapping("/info/{id}")
	public Info getInfo(@PathVariable String id) {
		return infoService.getInfo(id);
	}

}
