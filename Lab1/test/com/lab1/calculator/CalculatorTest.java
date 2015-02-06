package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() 
	{
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() 
	{
		assertEquals(4, calculator.add(2,2));
	}

	@Test
	public void subtractTest() 
	{
		assertEquals(3, calculator.subtract(7,4));
	}
	
	@Test
	public void multiplyTest() 
	{
		assertEquals(6, calculator.multiply(3, 2));
	}
	@Test
	public void divideTest() 
	{
		assertEquals(2, calculator.divide(4, 2));
	}
	@Test
	public void falseEqualsTest() 
	{
		assertFalse(calculator.isEqual(4,2));
	}
	@Test
	public void trueEqualsTest()
	{
		assertTrue(calculator.isEqual(2,2));
	}
}
