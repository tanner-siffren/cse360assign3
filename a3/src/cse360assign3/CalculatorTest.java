package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator data = new Calculator();
		
		assertNotNull(data); //tests that total isn't null
	}

	@Test
	public void testGetTotal() 
	{
		Calculator data = new Calculator();
		
		assertEquals(0, data.getTotal()); //tests that the initial value of total is 0
	}

	@Test
	public void testAdd() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.add(2);
		
		assertEquals(6, data.getTotal()); // tests that 4 + 2 = 6
	}

	@Test
	public void testSubtract() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.subtract(2);
		
		assertEquals(2, data.getTotal()); // tests 4 - 3 = 2
	}

	@Test
	public void testMultiply()
	{
		Calculator data = new Calculator();
		data.add(4);
		data.multiply(2);
		
		assertEquals(8, data.getTotal()); // tests 4 * 2 = 8
	}

	@Test
	public void testDivide() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.divide(2);
		
		assertEquals(2, data.getTotal()); // tests 4 / 2 = 2
	}
	
	@Test
	public void testDivideBY0() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.divide(0);
		
		assertEquals(0, data.getTotal()); // tests 4 / 0 returns 0
	}

	@Test
	public void testGetHistory() 
	{
		Calculator data = new Calculator();
		data.add(4);
		data.subtract(2);
		data.multiply(2);
		data.add(5);
		
		assertEquals("0 + 4 - 2 * 2 + 5", data.getHistory()); // test that get history returns a string of the different integers and their operators
	}

}
