import java.util.*;

class Employee
{
	private int id;
	private String name;
	int Salary;
	String department;
	
	public Employee(int id, String name, int Salary, String department)
	{
		this.id=id;
		this.name= name;
		this.Salary=Salary;
		this.department=department;
	}
	public String toString()
	{
		return id+" "+name+" "+Salary+" "+department; 
	}
	
	public void displayDetails()
	{
	//	System.out.println("Employee details: "+id+" "+name+" "+Salary+" "+department);
	}
}
public class Question1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"sam", 1000, "developer");
		Employee e2 = new Employee(2,"Aman", 2000, "designer");
		
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);


	}

}
