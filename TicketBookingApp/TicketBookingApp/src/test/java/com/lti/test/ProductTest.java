package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	Product p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//p=new Product();
	}

	@AfterAll
   static  void tearDownAfterClass() throws Exception {
		//p=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		p=new Product();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		p=null;
	}

	@Test
	void testGetProductId() {
		int actual=p.getProductId();
		int sample=100;
		assertEquals(actual,sample);
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		assertEquals("Bag",p.getName());
		//fail("Not yet implemented");
	}

}
