package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator data = new Calculator();
		
		assertNotNull(data);
	}

	@Test
	public void testGetTotal() 
	{
		Calculator data = new Calculator();
		
		assertEquals(0, data.getTotal());
	}

	@Test
	public void testAdd() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.add(2);
		
		assertEquals(6, data.getTotal());
	}

	@Test
	public void testSubtract() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.subtract(2);
		
		assertEquals(2, data.getTotal());
	}

	@Test
	public void testMultiply()
	{
		Calculator data = new Calculator();
		data.add(4);
		data.multiply(2);
		
		assertEquals(8, data.getTotal());
	}

	@Test
	public void testDivide() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.divide(2);
		
		assertEquals(2, data.getTotal());
	}
	
	@Test
	public void testDivideBY0() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.divide(0);
		
		assertEquals(0, data.getTotal());
	}

	@Test
	public void testGetHistory() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.subtract(2);
		data.multiply(2);
		data.add(5);
		
		assertEquals("0 + 4 - 2 * 2 + 5", data.getHistory());
	}

}
