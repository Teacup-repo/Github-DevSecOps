package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTestTest {

	@Test
	public void testDivide() {
		MathUtilsTest test = new MathUtilsTest();
		int result = test.divide(6,3);
		assertEquals(2, result);
		
	}

}
