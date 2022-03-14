package assign.assign5.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> emp = new ArrayList<>();
		employeeRepository.findAll()
		.forEach(emp::add);
		return emp;
	}
	
	public Optional<Employee> getEmployee(String id) {
		//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return employeeRepository.findById(id);
	
	}
	
	//POST
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	//PUT update
	public void updateEmployee(Employee emp) {
		employeeRepository.save(emp);
	
	}

	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}

}
