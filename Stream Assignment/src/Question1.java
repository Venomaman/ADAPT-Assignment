import java.util.*;
import java.util.stream.Collectors;
class Fruit {
	String name; 
	int calories; 
	int price; 
	String color; 
	
	public Fruit(String name,int calories,int price, String color)
	{
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName()
	{
		return name;
	}
	public int getCalories() {
		return calories;
	}
	
	public int getPrice() {
		return price;
	}
	public String getColor()
	{
		return color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}

}

public class Question1 {

	private static String NULL;
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("mango", 20, 50, "yellow");
		Fruit f2 = new Fruit("litchi", 50, 150, "red");
		Fruit f3 = new Fruit("banana", 90, 60, "green");
		Fruit f4 = new Fruit("orange", 120, 190, "red");
		ArrayList<Fruit> fruits = new ArrayList<>();
		fruits.add(f1);
		fruits.add(f2);
		fruits.add(f3);
		fruits.add(f4);
		
		List<Fruit> q1=fruits.stream().filter(cal->cal.calories< 100).collect(Collectors.toList());
		System.out.println(q1);
		List<Fruit> q2=fruits.stream().filter(p->p.color!=NULL).collect(Collectors.toList());
		System.out.println(q2);
		List<Fruit> q3=fruits.stream().filter(p->p.color=="red").collect(Collectors.toList());
		System.out.println(q3);
		
		
		
		

	}

}
