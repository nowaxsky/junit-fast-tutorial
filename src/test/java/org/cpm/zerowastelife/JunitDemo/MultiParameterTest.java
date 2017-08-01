package org.cpm.zerowastelife.JunitDemo;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;


@RunWith(Parameterized.class)
public class MultiParameterTest extends TestCase{
	
	private MyClass myClass;
	
	private int inputA;
	private int inputB;
	private int expectedOutput;

	public MultiParameterTest(int inputA, int inputB, int expectedOutput) {
		this.inputA = inputA;
		this.inputB = inputB;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> setParameters() {
		Collection<Object[]> params = new ArrayList<Object[]>();
		params.add(new Object[] {5,15,20});
		params.add(new Object[] {3,4,7});
		params.add(new Object[] {1,0,1});
		return params;
	}
	
	@Before
	public void createTest() {
		myClass = new MyClass();
	}
	
	@Test
	public void test() {
		assertEquals(expectedOutput, myClass.add(inputA,inputB));
	}
	
	@After
    public void endTest() {
		myClass = null;
		inputA = 0;
		inputB = 0;
		expectedOutput = 0;
	}

}
