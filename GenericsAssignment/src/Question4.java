import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		Pair<String, String> Pairobj1=new Pair<String, String>("1","Hello");
		System.out.println("We are passing String and String: ");
		System.out.println(Pairobj1.getKey()+" "+Pairobj1.getValue());
		System.out.println("---------------");
		
		Pair<String, Date> Pairobj2=new Pair<String, Date>("Today is",new java.util.Date());
		
		System.out.println("We are passing String and Date: ");
		System.out.println(Pairobj2.getKey()+" "+Pairobj2.getValue());
		}

	}

