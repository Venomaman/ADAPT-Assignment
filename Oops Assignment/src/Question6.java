abstract class Persistence{
	abstract public String persist();
}

class FilePersistence extends Persistence{
	public String persist()
	{
		return "Data is saaved in file";
	}
}

class DatabasePersistence extends Persistence{
	public String persist() {
		return "Data is saved in database";
	}
}

public class Question6 {

	public static void main(String[] args) {
		Persistence pr;
		pr=new FilePersistence();
		System.out.println(pr.persist());
		pr=new DatabasePersistence();
		System.out.println(pr.persist());

	}

}
