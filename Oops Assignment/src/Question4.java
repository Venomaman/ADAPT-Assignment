abstract class Bike{
	 Bike()  //constructor
	{
		System.out.println("Bike is created");
	}
	abstract void run();  //abstract method.
	void changeGear()    //non-abstract method.
	{
		System.out.println("gear changed...");
	}
}
class H2R extends Bike{
	void run() {
		System.out.println("running supersonic");
	}
}
public class Question4 {

	public static void main(String[] args) {
		Bike B1 = new H2R();
		B1.run();
		B1.changeGear();

	}

}
