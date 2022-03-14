import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//import java.util.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{	
}


public class Question1 {
	@Test
	public static void testCase()
	{
		System.out.println("Applied to this method");
	}

	public static void main(String[] args) {
		testCase();
		
	}

}
