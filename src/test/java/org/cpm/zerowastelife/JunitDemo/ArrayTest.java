package org.cpm.zerowastelife.JunitDemo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testArray() {
		int numbers[] = {10,0,5,20};
		int expected[] = {0,5,10,20};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	
	
	@Test(timeout=100)
	public void testPerformance() {
		int numbers[] = {10,0,5,20};
		for(int i=0; i<1000000; i++) {
			Arrays.sort(numbers);
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullArray() {
		int numbers[] = null;
		Arrays.sort(numbers);
	}

}
