package testingAssignment;

public class BankAccount {
	
	double totalBalance = 60000;
	
	public double withdraw(double amount) throws InsufficientBalException
	{
		if(amount>totalBalance || amount<100)
		{
			throw new InsufficientBalException("NOT VALID AMOUNT");
		}
		else {
			if(amount%500==0 || amount%100==0 || amount%200==0)
			{
				totalBalance=totalBalance-amount;
			}
		}
		
		System.out.println("Total Amount Withdrawn: "+amount);
		System.out.println("Total Amount Left: "+totalBalance);
		return totalBalance;
	}
	

}
class InsufficientBalException extends Exception
{
	private static final long serialVersionUID = 1L;
	public InsufficientBalException(String msg)
	{
		super(msg);
	}
}
