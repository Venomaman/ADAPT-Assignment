
public class StringBufferQ1 {

	public static void main(String[] args) {
		StringBuffer sbf1 = new StringBuffer("StringBuffer");
		StringBuffer sbf2 = new StringBuffer("is a peer class of String");
		StringBuffer sbf3 = new StringBuffer("that provides much of");
		StringBuffer sbf4 = new StringBuffer("the functionality of strings");
		
		System.out.println("After appending these strings: "+sbf1.append(sbf2).append(" ").append(sbf3).append(" ").append(sbf4));
		

	}

}
