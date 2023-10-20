package com.junitproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator calc = new Calculator();
	@Before
	public void print() {
		System.out.println("Hello Viratians...");
	}
	@Test
	public void testAdd() {
		System.out.println(calc.add(23,55));
	}
	@Test
	public void testSub() {
		calc.sub();
	}
	@Test
	public void testDiv() {
		calc.div();
	}
	@Test
	public void testMul() {
		calc.mul(9, 2);
	}
	@After
	public void printBye() {
		System.out.println("Bye");
	}

}
