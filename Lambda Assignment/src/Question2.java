import java.util.*;
class Orders{
	int totalPrice;
	String status; 
	
	public Orders(int totalPrice, String status)
	{
		this.totalPrice=totalPrice;
		this.status=status;
	}
	public int gettotalPrice()
	{
		return totalPrice;
	}
	public String getstatus()
	{
		return status;
	}
}

interface function
{
	void method(int a, String b);
}


public class Question2 {
	public static void main(String[] args) {
		Orders o1 =new Orders(1111,"completed");
		Orders o2 =new Orders(11111212,"pending");
		Orders o3 =new Orders(111119999,"completed");
		Orders o4 =new Orders(111112321,"completed");
		ArrayList<Orders>listOfOrders=new ArrayList<>();
		listOfOrders.add(o1);
		listOfOrders.add(o2);
		listOfOrders.add(o3);
		listOfOrders.add(o4);
		
		function printOrder=(a,b)->
		{
			if(a>10000 && (b.equals("completed")))
			{
				System.out.println(a+" "+b);
			}
			else
			{
				System.out.println("order not accepted");
			}
		};
		printOrder.method(o1.gettotalPrice(), o1.getstatus());
		printOrder.method(o2.gettotalPrice(), o2.getstatus());
		printOrder.method(o3.gettotalPrice(), o3.getstatus());
		printOrder.method(o4.gettotalPrice(), o4.getstatus());
		
		
	}


}
