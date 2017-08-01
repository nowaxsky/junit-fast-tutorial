package org.cpm.zerowastelife.JunitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {
	
	MyClass myClass = new MyClass();
	
	//constructor
	public MyClassTest() {
		System.out.println("\nBuild an object");
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before class test");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After test");
	}

	@Test
	public void addTest() {
		assertEquals(10, myClass.add(3, 7));
		System.out.println("Add method is testing");
	}
	
	@Test
	public void passTest() {
		assertTrue(myClass.pass(72));
		System.out.println("Pass method is testing");
		//assertFalse(myClass.pass(80));
	}
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("\nAfter class test");
	}

}
