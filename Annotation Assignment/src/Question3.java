import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
	int Sequence() default 1;
}

class MyClass{
@Execute(Sequence=2)
public void myMethod1(){
	System.out.println("this is method1");
}
@Execute(Sequence=1)
public void myMethod2(){
	System.out.println("this is method2");
}
@Execute(Sequence=3)
public void myMethod3(){
	System.out.println("this is method3");
}
}


public class Question3 {

	public static void main(String[] args)throws NoSuchMethodException,SecurityException{
		
		MyClass obj = new MyClass();
		Class c= obj.getClass();
		//Method m = c.getMethod();
		Annotation an = c.getAnnotation(Execute.class);
		Execute e = (Execute)an;
		e.Sequence();

	}

}
