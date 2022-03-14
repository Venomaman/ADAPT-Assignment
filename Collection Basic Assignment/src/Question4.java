import java.util.LinkedList;
import java.util.ListIterator;
public class Question4 {

	static boolean Checkleap(String str)
	{
		String[] arr = str.split("-");
		int year = Integer.parseInt(arr[2]);
		 if (year % 4 == 0) 
		 {
		      if (year % 100 == 0)
		      {
		        if (year % 400 == 0)
		          return true;
		        else
		          return false;
		      }
		      else
		      {
		        return true;
		      }
		  } 
		    else
		      return false;
	}
	public static void main(String[] args){
		 LinkedList<String> dt=new LinkedList<String>();  
		 dt.add("12-6-2010");
		 dt.add("11-9-2022");
		 dt.add("25-1-2000");
		 ListIterator<String> itr = dt.listIterator(dt.size());
		  while(itr.hasPrevious()){  
		   String str=itr.previous();
		   if(Checkleap(str))
		   {
			   System.out.println("Your date of birth is "+str+" and it was a leap year");
		   }
		   else 
		   {
			   System.out.println("Your date of birth is "+str+" and it was not a leap year");
		   }		  
		  }  
	}

}
