class Bank{
	int totalCash=100000;
	public int getCash()
	{
		return 0;
	}
}
class CurrentAccount extends Bank{
	int totalDeposit=10000;
	int creditLimit = 2000;
	
	public int getCash()
	{
		return (totalCash+totalDeposit);
	}
}
class SavingAccount extends Bank{
	int totalDeposit=10000;
	int fixedDeposit=5000;
	
	public int getCash()
	{
		return(totalCash+totalDeposit);
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new CurrentAccount();
		System.out.println("Total cash in BANK B1:"+b1.getCash());
		Bank b2 = new SavingAccount(); 
		System.out.println("Total cash in BANK B2:"+b2.getCash());
		
				

	}

}
