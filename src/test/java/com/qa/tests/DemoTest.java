package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("SUM");
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 30);
		
	}
	
	@Test
	public void sub() {
		System.out.println("SUB");
		int a=10;
		int b=20;
		Assert.assertEquals(b-a, 10);
		
	}
	
	@Test
	public void div() {
		System.out.println("DIV");
		int a=10;
		int b=20;
		Assert.assertEquals(b/a, 2);
		
	}
	
	@Test
	public void mul() {
		System.out.println("MUL");
		int a=10;
		int b=20;
		Assert.assertEquals(a*b, 200);
		
	}

}
