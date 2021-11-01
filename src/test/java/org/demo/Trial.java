package org.demo;

import static org.junit.Assert.*;

import org.junit.*;


public class Trial {

	@Test
	public void test() {
		System.out.println("this is test");
	}
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Before
	public void befmethod() {
	System.out.println("this run before test");

	}
	
	@After
	public void Aftmethod() {
	System.out.println("this run after test");

	}
	
	@BeforeClass
	public static void first() {
	System.out.println("This run top first");

	}
	
	@AfterClass
	public static void last() {
	System.out.println("this run last");

	}

}
