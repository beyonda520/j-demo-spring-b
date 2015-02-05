package com.pingan.stock.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {
	
	@Test
	public void createObject() {
		App app = new App();
		
		assertNotNull(app);
		
		app = null;
		assertNull(app);
		
		assertTrue(true);
	}
	
	@Test
	public void testDoSomething() {
		App app = new App();
		
		assertNotNull(app);
		
		int result = app.doSomething();
		assertEquals(0, result);
		
		assertTrue(true);
	}
}