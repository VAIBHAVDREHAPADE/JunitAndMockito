package com.dynamics.pro.stringhelpertest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.*;

import com.dynamics.pro.StringHelper;

class StringHelperTest {

	@Before
	public void beforeEachTest()
	{
		System.out.print("Before executiojn block of code");
	}
	
	@Test
	void testTruncateInFirst2Position() {
		StringHelper helper = new StringHelper();
		String input ="AACD";
		String actualOutput = helper.truncateAInFirst2Positions(input);
		String ExpectedOutput= "CD";
		assertEquals(ExpectedOutput,actualOutput);
		System.out.print("Test 1");
}
	@Test
	void testTruncateInFirst2PositionTest2() {
		StringHelper helper = new StringHelper();
		String input ="AACD";
		String actualOutput = helper.truncateAInFirst2Positions(input);
		String ExpectedOutput= "CDr";
		assertEquals(ExpectedOutput,actualOutput);
		System.out.print("Test 2");

}

}
