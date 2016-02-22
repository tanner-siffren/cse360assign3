package cse360assign3;

public class Calculator 
{
	
	private int total;
	private String hist; 
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		hist = "0";
	}
	
	public int getTotal ()
	{
		return total;
	}
	
	public void add (int value) 
	{
		total = total + value;
		hist = hist  + " + " + value;
	}
	
	public void subtract (int value) 
	{
		total = total - value;
		hist = hist  + " - " + value;
	}
	
	public void multiply (int value) 
	{
		total = total * value;
		hist = hist  + " * " + value;
	}
	
	public void divide (int value) 
	{
		if (value == 0)
		total = 0;
		else
		total = total / value;
		hist = hist  + " / " + value;
	}
	
	public String getHistory () 
	{
		return hist;
	}

}
