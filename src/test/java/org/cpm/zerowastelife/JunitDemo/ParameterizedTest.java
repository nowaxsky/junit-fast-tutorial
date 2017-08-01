package org.cpm.zerowastelife.JunitDemo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class ParameterizedTest extends TestCase{

	MyClass myClass = new MyClass();
	
	private String input;
	private String expectedOutput;
	
	public ParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> setParameters() {
		String params[][] = {{"Sun","yes"}, {"Mon","no"}};
		return Arrays.asList(params);
	}

	@Test
	public void test() {
		assertEquals(expectedOutput, myClass.isWeekend(input));
	}

}
