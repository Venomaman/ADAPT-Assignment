package assign.assign6.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController6 {
	
	@GetMapping("/add/{x}/{y}")
	public Calculatot add(@PathVariable int x, @PathVariable int y)
	{
		return new Calculatot(x, y, x+y);
	}
	
	@GetMapping("/sub/{x}/{y}")
	public Calculatot sub(@PathVariable int x, @PathVariable int y)
	{
		return new Calculatot(x, y, x-y);
	}
	
	@GetMapping("/mul/{x}/{y}")
	public Calculatot mul(@PathVariable int x, @PathVariable int y)
	{
		return new Calculatot(x, y, x*y);
	}
	
	@GetMapping("/div/{x}/{y}")
	public Calculatot div(@PathVariable int x, @PathVariable int y)
	{
		return new Calculatot(x, y, x/y);
	}
	@GetMapping("/sqrt/{x}")
	public int sqrt(@PathVariable int x)
	{
		return (x*x);
	}

}
