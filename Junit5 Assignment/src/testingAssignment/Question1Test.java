package testingAssignment;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question1Test {

	@Test
	void test() {
		Question1 array = new Question1();
		assertArrayEquals(new int[]{3,56}, array.findMinMax(new int[] {56,34,7,3,54,3,34,34,53}),"first test case"); 
	}
	
	@Test
	void test2()
	{
		Question1 array = new Question1();
		assertThrows(IllegalArgumentException.class,()->
		{
			array.findMinMax(new int[] {56,34,7,3,54,3,34,34,53} );
		});
	}

}
