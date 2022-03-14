package assign.assign5.com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController5 {
	
	@Autowired
	private EmployeeService employeeService;
	
	//get all emps.....
	
	@RequestMapping("/emp")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();	
	}
	
	//get single emps....
	
	@RequestMapping("/emp/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	//POST method add employee.
	
	@RequestMapping(method = RequestMethod.POST, value="/emp")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
	}
	
	//PUT  update topic.
	@RequestMapping(method = RequestMethod.PUT, value="/emp/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable String id)
	{
		employeeService.updateEmployee(emp);
	}
	
	@RequestMapping(method= RequestMethod.DELETE,value="/emp/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}
}


