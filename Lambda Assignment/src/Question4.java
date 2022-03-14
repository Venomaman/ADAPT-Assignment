import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("aman");
		words.add("disha");
		words.add("ritik");
		words.add("adarsh");
		words.add("SP");
		
		words.removeIf(n ->(n.length()%2!=0));
		for(String str: words)
		{
			System.out.println(str);
		}

	}

}
