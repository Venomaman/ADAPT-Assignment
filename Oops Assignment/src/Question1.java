class Student{
	static Student st = new Student();
	
	private Student()
	{
		System.out.println("COnstructor will call for only one object");
	}
	
	static Student getInstance()
	{
		return st;
	}
}
public class Question1 {

	public static void main(String[] args) {
		Student st1 = Student.getInstance();
		Student st2 = Student.getInstance();

	}

}
