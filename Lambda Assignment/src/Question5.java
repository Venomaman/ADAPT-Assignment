import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("alpha");
		list.add("bravo");
		list.add("charlie");
		list.add("delta");
		list.add("echo");
		list.add("foxtrot");
		
		Consumer<String> consum = (t)->System.out.println(t);
		consum.accept(totWords(list));

	}
	
	public static String totWords(List<String>list)
	{
		StringBuilder sb = new StringBuilder("");
		list.forEach(t->sb.append(t.charAt(0)));
		return sb.toString();
	   
	}

}
