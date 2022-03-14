
public class StringBuilderQues1 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("StringBuffer");
		StringBuilder sb2 = new StringBuilder("is a peer class of String");
		StringBuilder sb3 = new StringBuilder("that provides much of");
		StringBuilder sb4 = new StringBuilder("the functionality of strings");
		
		System.out.println("After appending these strings: "+sb1.append(sb2).append(" ").append(sb3).append(" ").append(sb4));

	}

}
