abstract class Shape{
	
	abstract public void draw();
}
class Line extends Shape{
	public void draw()
	{
		System.out.println("Draw a line....");
	}
}
class Rectangle extends Shape{
	public void draw()
	{
		System.out.println("Draw the rectanglre..");
	}
	
}

class Cube extends Shape{
	public void draw()
	{
		System.out.println("draw the cube..");
	}
}


public class Question5 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Line();
		Shape s3 = new Cube();
		s1.draw();
		s2.draw();
		s3.draw();	

	}

}
