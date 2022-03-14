
public class StringQuest3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		String str2= "java string pool refers to collection of strings which are stored in heap memory";
		String strLower = str.toLowerCase();
		String strUpper = str.toUpperCase();
		System.out.println("String in Lower case: " +strLower);
		System.out.println("String in upper case: " +strUpper);
		System.out.println("replace a with $ : "+str.replace('a', '$') );
		System.out.println("String contain collection? : "+str.contains("collection"));
		System.out.println("Str1 match with strg2 ?: " +str.equals(str2));
		System.out.println("Str1 match with strg2 with ignore the case?: " +str.equalsIgnoreCase(str2));

	}

}
