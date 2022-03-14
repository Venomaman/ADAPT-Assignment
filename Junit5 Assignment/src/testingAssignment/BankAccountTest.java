package testingAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BankAccountTest {
	
	BankAccount a;
	@BeforeEach
	void init()
	{
		a=new BankAccount();
	}
	@DisplayName("Withdraw Amount...")
	@Test
	void test()
	{
		assertThrows(InsufficientBalException.class,()->a.withdraw(65000.00),"test case insufficient fund");
	}
	@DisplayName("Withdrawing Amount..")
	@Test
	void test2()
	{
		try
		{
			assertEquals(59500,a.withdraw(500),"Sucess test case");
		}
		catch(InsufficientBalException e)
		{
			System.out.println("Enter validAmount again.....");
		}
	}

}
