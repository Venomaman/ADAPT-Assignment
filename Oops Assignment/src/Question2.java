 class Employee{
	static int salary=10000;
	public void getSalary()
	{
	}
}
class Manager extends Employee{
	public void getSalary()
	{
		int incentive=5000;
		//return salary;
		System.out.println("salary get by a manager :"+ (salary+incentive) );
	}
}

class Labour extends Employee{
	public void getSalary()
	{
		int overtime = 500;
		//return salary;
		System.out.println("Salary get by labour:"+(salary+overtime));
	}
}
public class Question2 {

	public static void main(String[] args) {
		 Employee e1 = new Manager();
		 e1.getSalary();
		 Employee e2 = new Labour();
		 e2.getSalary();

	}

}
