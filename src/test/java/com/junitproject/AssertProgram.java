package com.junitproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertProgram {
	int[] a = {1,5,7,8};
	MaxNumber max = new MaxNumber();
	
	@Test
	public void testAssertEquals() {
		assertEquals(10, 10);
	}
	@Test
	public void testAssertNotEquals() {
		assertNotEquals(10, 1);
	}
	@Test
	public void testNull() {
		assertNull(null,null);
	}
	@Test
	public void testNotNull() {
		assertNotNull("nisha");
	}
	@Test
	public void testTrue() {
		boolean a = 10>3;
		assertTrue(a);
	}
	@Test
	public void testFalse() {
		boolean a = 10<3;
		assertFalse(a);
	}
	@Test
	public void testSame() {
		assertSame("nisha", "nisha");
	}
	@Test
	public void testNotSame() {
		assertNotSame("nisha", "nishaa");
	}
	@Test
	public void testArray() {
		int[] a = {26,9,926};
		int[] b = {26,9,926};
		assertArrayEquals(a, b);
	}
	

}
