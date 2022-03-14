import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
public class Question6 {

		public static List<String> convertToUpperCase(List<String>list){
		return list;
		
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aman");
		list.add("kumar");
		list.add("anand");
		list.add("sam");
		list.add("hooman");
		
		UnaryOperator<String> operator = t -> t.toUpperCase();
		convertToUpperCase(list).replaceAll(operator);
		System.out.println(convertToUpperCase(list));
		
		

	}

	}


