package com.dynamics.pro.stringhelpertest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.assertj.core.util.Arrays;
import org.junit.*;

import com.dynamics.pro.StringHelper;
@RunWith(Parameterized.class)
class StringHelpeParameterClassTest {
	
	StringHelper helper = new StringHelper();
	private String inputValue;
	private String Expectedvalue;
	
	
	
public StringHelpeParameterClassTest(String inputValue, String expectedvalue) {
		super();
		this.inputValue = inputValue;
		Expectedvalue = expectedvalue;
	}

@Parameters
public static Collection<String[]> testConditions() {
	String expectedOutputs[][] = { 
			{ "AACD", "CD" }, 
			{ "ACD", "CD" } };
	return Arrays.asList(expectedOutputs);
}
	
	@Test
	void testTruncateInFirst2Position() {
		String actualOutput = helper.truncateAInFirst2Positions(inputValue);
		assertEquals(Expectedvalue,actualOutput);
		System.out.print("Test 1");
}


}
