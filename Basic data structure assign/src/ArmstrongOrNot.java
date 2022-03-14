import java.util.Scanner;
import java.lang.Math;
public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, temp, totalDigit=0, res=0, rem;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Number: ");
	      num = scan.nextInt();
	      
	      temp = num;
	      while(num>0)
	      {
	         num /= 10;
	         totalDigit++;
	      }
	      
	      num = temp;
	      while(num>0)
	      {
	         rem = num%10;
	         res = res + (int) Math.pow(rem, totalDigit);
	         num /= 10;
	      }
	      
	      if(res==temp)
	         System.out.println("\nArmstrong Number");
	      else
	         System.out.println("\nNot an Armstrong Number.");

	}

}
