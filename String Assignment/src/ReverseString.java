
public class ReverseString {

	public static void main(String[] args) {
		String str="Hello Miami";
		char[] strArray= str.toCharArray();
		String reversedString = "";
		
		for(int i= strArray.length-1; i>=0; i--)
		{
			reversedString= reversedString+ strArray[i];
		}
			//System.out.print(str);
			System.out.println(reversedString);
		}

	}


