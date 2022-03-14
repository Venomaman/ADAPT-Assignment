import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new TreeMap<>();
		map.put("abc", 1);
		map.put("cde", 2);
		map.put("efg", 3);
		map.put("ghi", 4);
		
		StringBuilder sb = new StringBuilder();
		map.entrySet().forEach(entry -> sb.append(entry.getKey()).append(entry.getValue()));
		
		System.out.println(sb.toString());
		

	}

}
