package test;

import static org.junit.Assert.*;

import org.junit.Test;
public class ConcateTest {

	@Test
	public void testConcatenate() {
		MathUtilsTest test = new MathUtilsTest();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
		
	}
}
