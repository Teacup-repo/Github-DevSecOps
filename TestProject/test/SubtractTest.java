package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void testSubtract() {
		MathUtilsTest test = new MathUtilsTest();
		int result = test.subtract(6,3);
		assertEquals(3, result);
		
	}

}
