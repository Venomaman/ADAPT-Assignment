package testingAssignment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question4 {
	
	@BeforeAll
	static void runBeforeAllTest() {
		System.out.println("@BeforeAll TEST executed..");
	}
	@BeforeEach
	void runBeforeEveryTest()
	{
		System.out.println("@BeforeEach Test Executed..");
	}
	@Test
	void testMethod()
	{
		System.out.println("@test method executed.....");
	}
	@AfterEach
	void runAfterEveryTest() {
		System.out.println("@AfterEach Executed......");
	}
	@AfterAll
	static void runOnceAfterAllTest()
	{
		System.out.println("@after all Executed.....");
	}

}
