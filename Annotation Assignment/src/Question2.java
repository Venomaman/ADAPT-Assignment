import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int AuthorID();
	String Date();
	String Time();
	int Version();
	
}


@info(AuthorID=111 , Date ="YYYY-MM-DD", Time = "HH:mm:ss", Version = 1 )
class Author{
	int id;
}
public class Question2 {

	public static void main(String[] args) {
		Author obj = new Author();
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(info.class);
		info i =(info)an;
		System.out.println(i.AuthorID()+" "+ i.Date()+" "+i.Time()+" "+i.Version());
		

	}

}
